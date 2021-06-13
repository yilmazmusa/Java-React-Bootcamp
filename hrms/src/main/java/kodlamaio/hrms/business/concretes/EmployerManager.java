package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.business.businessRules.BusinessRules;
import kodlamaio.hrms.business.constants.Messages;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;


@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Data listelendi");
	}
	
	
	@Override
	public Result add(Employer employer) {
		
		Result result = BusinessRules.run(emailExist(employer.getEmail()),checkIfEqualEmailAndDomain(employer.getEmail(), employer.getWebSite()));

		if (result.isSuccess()) {
			employerDao.save(employer);
			return new SuccessResult("Employer added");
		}
		return result;
	}
	

	@Override
	public Result update(Employer employer) {
		
		Result result = BusinessRules.run(emailExist(employer.getEmail()),checkIfEqualEmailAndDomain(employer.getEmail(), employer.getWebSite()));

		if (result.isSuccess()) {
			employerDao.save(employer);
			return new SuccessResult("Employer update");
		}
		return result;
	}

	@Override
	public Result delete(int id) {
		this.employerDao.deleteById(id);
		return new SuccessResult("Employer deleted");
	}

	
	
	
											//METOD KURALLARI  
	

		private Result emailExist(String email) {
			if (employerDao.findAllByEmail(email).stream().count() != 0) {
				return new ErrorResult("This Email is available");
			}
			return new SuccessResult();
		}
		
		private Result checkIfEqualEmailAndDomain(String email, String website) {

			String[] emailArr = email.split("@", 2); // @ gördüğünde böler 2 ayrı parçaya ve dizide tuttuk
			String domain = website.substring(4, website.length()); // 4. karakterden başlayıp website uzunluğu kadar alır
			// System.out.println(domain);
			//www.kodlamaio.com - kullanıcıismi@kodlamaio.com
			if (emailArr[1].equals(domain)) {
				return new SuccessResult("Domain added");
			}
			return new ErrorResult("Domain is wrong");
		}
		
		private Result  checkNationalityId(String nationalityId) {
			
			if (nationalityId.length()<11 || nationalityId.length()>11) {			
				return new ErrorResult("Hatalı");
			}else {
				return new SuccessResult(" Başarılı");
			}			
		}

		

		
}
