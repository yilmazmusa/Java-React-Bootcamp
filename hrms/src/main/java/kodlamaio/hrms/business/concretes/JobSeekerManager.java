package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EducationForCvService;
import kodlamaio.hrms.business.abstracts.ExperienceForCvService;
import kodlamaio.hrms.business.abstracts.ImageForCvService;
import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.business.abstracts.LanguageForCvService;
import kodlamaio.hrms.business.abstracts.LinkForCvService;
import kodlamaio.hrms.business.abstracts.SkillForCvService;
import kodlamaio.hrms.business.businessRules.BusinessRules;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.entities.dtos.JobSeekerCvDto;

@Service
public class JobSeekerManager implements JobSeekerService{


	private JobSeekerDao jobseekerDao;
	private ExperienceForCvService experienceForCvService;
	private LanguageForCvService languageForCvService;
	private ImageForCvService imageForCvService;
	private LinkForCvService linkForCvService;
	private SkillForCvService skillForCvService;
	private EducationForCvService educationForCvService;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobseekerDao, ExperienceForCvService experienceForCvService,
			LanguageForCvService languageForCvService, ImageForCvService imageForCvService,
			LinkForCvService linkForCvService, SkillForCvService skillForCvService,
			EducationForCvService educationForCvService) {
		super();
		this.jobseekerDao = jobseekerDao;
		this.experienceForCvService = experienceForCvService;
		this.languageForCvService = languageForCvService;
		this.imageForCvService = imageForCvService;
		this.linkForCvService = linkForCvService;
		this.skillForCvService = skillForCvService;
		this.educationForCvService = educationForCvService;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(jobseekerDao.findAll(), "Data Listelendi");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		Result result = BusinessRules.run(emailExist(jobSeeker.getEmail()),tcExist(jobSeeker.getNationalId()));

		if (result.isSuccess()) {
			jobseekerDao.save(jobSeeker);
			return new SuccessResult("Eklendi");
		}
		return result;
	}
	
	@Override
	public Result update(JobSeeker jobseeker) {
		this.jobseekerDao.save(jobseeker);
		return new SuccessResult("Jobseeker updated.");
	}

	@Override
	public Result delete(int id) {
		this.jobseekerDao.deleteById(id);
		return new SuccessResult("Jobseeker deleted.");
	}
	
	@Override
	public DataResult<JobSeeker> getById(int id) {
		return new SuccessDataResult<JobSeeker>(this.jobseekerDao.findById(id).get());
	}

	@Override
	public DataResult<JobSeeker> getJobseekerByNationalId(String nationalId) {
		return new SuccessDataResult<JobSeeker>(this.jobseekerDao.findJobseekerByNationalId(nationalId));
	}

	@Override
	public DataResult<JobSeekerCvDto> getJobseekerCVById(int id) {
		JobSeekerCvDto cv= new JobSeekerCvDto();
		cv.experiences=this.experienceForCvService.getAllByJobSeekerId(id).getData();
		cv.languages=this.languageForCvService.getAllByJobSeekerId(id).getData();
		cv.image=this.imageForCvService.getByJobSeekerId(id).getData();
		cv.links =this.linkForCvService.getAllByJobSeekerId(id).getData();
		cv.skills=this.skillForCvService.getAllByJobSeekerId(id).getData();
		cv.educations=this.educationForCvService.getAllByJobSeekerId(id).getData();
		return new SuccessDataResult<JobSeekerCvDto>(cv);
	}
	
	
									//METOD KURALLARI  
	
	private Result emailExist(String email) {
		if (jobseekerDao.findAllByEmail(email).stream().count() != 0) {
			return new ErrorResult("Bu Email Adresi Mevcut");
		}
		return new SuccessResult();
	}
	
	private Result tcExist(String nationalId) {
		if (jobseekerDao.findAllByNationalId(nationalId).stream().count() != 0) {
			return new ErrorResult("Bu TC Bilgisi Mevcut");
		}
		return new SuccessResult();
	}
	

}
