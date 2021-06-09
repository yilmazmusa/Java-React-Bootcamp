package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.business.businessRules.Rules;
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
	private UserService userService;

	@Autowired
	public EmployerManager(EmployerDao employerDao, UserService userService) {
		
		this.employerDao = employerDao;
		this.userService = userService;
	}

	@Override
	public Result add(Employer employer) {
		
		if (Rules.checkMail(employer.getEmail()) && Rules.checkCompanyName(employer.getCompanyName()) && Rules.checkPassword(employer.getPassword()) && Rules.checkPhone(employer.getPhone()) && Rules.checkWebSite(employer.getWebSite())) {
			
			if (userService.existsByeMail(employer.getEmail())!=true) {
				
				this.employerDao.save(employer);
				return new SuccessResult (Messages.addedEmployer);
			}else {
				
				return new ErrorResult(Messages.errorRegisteredMail);				
			}			
		}
		else {
			
			if (Rules.checkMail(employer.getEmail())==false) {
				
				return new ErrorResult(Messages.errorMail);	
			}
			else if (Rules.checkCompanyName(employer.getCompanyName())==false) {
				
				return new ErrorResult(Messages.errorCompanyName);	
			}
			else if (Rules.checkWebSite(employer.getWebSite())==false) {
				
				return new ErrorResult(Messages.errorWebSite);	
			}
			else if (Rules.checkPassword(employer.getPassword())==false) {
				
				return new ErrorResult(Messages.errorPassword);	
			}
			else if (Rules.checkPhone(employer.getPhone())==false) {
				
				return new ErrorResult(Messages.errorPhone);	
			}
		}
		return new ErrorResult(Messages.errorInformation);
	}	

	@Override
	public DataResult<List<Employer>> getAll() {		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), Messages.listedEmployers);
	}

	@Override
	public Result updateEmployer(String mail, String password, String companyName, String webSite, String phone,
			int id) {
		if (Rules.checkMail(mail) && Rules.checkCompanyName(companyName) && Rules.checkPassword(password) && Rules.checkPhone(phone) && Rules.checkWebSite(webSite)) {
			
			if (userService.existsByeMail(mail)) {
				
				this.employerDao.updateEmployer(mail, password, companyName, webSite, phone, id);
				return new SuccessResult(Messages.updatedEmployer);
			}else {
				
				return new ErrorResult(Messages.errorRegisteredMail);				
			}			
		}
		else {
			
			if (Rules.checkMail(mail)==false) {
				
				return new ErrorResult(Messages.errorMail);	
			}
			else if (Rules.checkCompanyName(companyName)==false) {
				
				return new ErrorResult(Messages.errorCompanyName);	
			}
			else if (Rules.checkWebSite(webSite)==false) {
				
				return new ErrorResult(Messages.errorWebSite);	
			}
			else if (Rules.checkPassword(password)==false) {
				
				return new ErrorResult(Messages.errorPassword);	
			}
			else if (Rules.checkPhone(phone)==false) {
				
				return new ErrorResult(Messages.errorPhone);	
			}
		}
		return new ErrorResult(Messages.errorInformation);
	}

	@Override
	public Result deleteEmployer(int id) {		
		this.employerDao.deleteById(id);
		return new SuccessResult(Messages.updatedEmployer);		
	}
}
