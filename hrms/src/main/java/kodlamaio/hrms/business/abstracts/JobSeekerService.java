package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.entities.dtos.JobSeekerCvDto;

public interface JobSeekerService {
	
	
	DataResult<List<JobSeeker>> getAll();
	DataResult<JobSeeker> getById(int id);
	DataResult<JobSeeker> getJobseekerByNationalId(String nationalId);	

	Result add(JobSeeker jobseeker);
	Result update(JobSeeker jobseeker);
	Result delete(int id);
	
	DataResult<JobSeekerCvDto> getJobseekerCVById(int id);

}
