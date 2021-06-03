package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.business.abstracts.EmailVerificationService;
import kodlamaio.hrms.core.utilities.adapter.IdentityValidation;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.User;

@Service
public class CandidateManager implements CandidateService{
	
	//dependecy injection
	
	@Autowired
	private CandidateDao candidateDao;
	private EmailVerificationService emailVerificationService;
	private User user;
	private IdentityValidation ıdentityValidation;
	
	public  CandidateManager(Candidate candidate,User user, IdentityValidation ıdentityValidation) {
		
		super();
		this.candidateDao=candidateDao;
		this.ıdentityValidation=ıdentityValidation;
		this.user=user;
		
	}

	@Override
	public DataResult<Candidate> add(Candidate candidate) { 
		
		if(!fistNameChecker(candidate)) {
			
			return new ErrorDataResult<Candidate>(null,"Ad bilgisi doldurulmak zorundadır");
		}
		
		
		else if(!lastNameChecker(candidate)) {
			
			return new ErrorDataResult<Candidate>(null,"SoyAdıbilgisi doldurulmak zorundadır");
			
		}
		
		
		else if(!birthDateChecker(candidate)) {
			
			return new ErrorDataResult<Candidate>(null,"Doğum Tarihi bilgisi doldurulmak zorundadır");
			
		}
		
		else if(!emailNullChecker(candidate)) {
			
			return new ErrorDataResult<Candidate>(null,"Email bilgisi doldurulmak zorundadır");
		}
		
		else if(!passwordNullChecker(candidate)) {
			
			return new ErrorDataResult<Candidate>(null,"Şifre bilgisi doldurulmak zorundadır");
			
		}
		
		else if(!isRealEmail(candidate)) {
			
			return new ErrorDataResult<Candidate>(null,"Email formatınız yanlış");
		}
		
		else if(candidate.getIdentificationNumber().isBlank()) {
			
			return new ErrorDataResult<Candidate>(null,"Tc Kimlik bilgisi doldurulmak zorundadır");
		}
		
		else if(ıdentityValidation.isRealPerson(candidate)) {
			
			return new ErrorDataResult<Candidate>(null,"Kimlik Doğrulanamadı");
			
		}
		
		
	}
	
	
	
	
	public boolean fistNameChecker(Candidate candidate) {
		
		if(candidate.getFirstName().isBlank() || candidate.getFirstName().equals(null)) {
			
			return false;
		}
		return true;
		
		
	}
	
	public boolean lastNameChecker(Candidate candidate) {
		
		if(candidate.getLastName().isBlank() || candidate.getLastName().equals(null) ) {
			
			return false;
		}
		return true;
	}
	
	public boolean birthDateChecker(Candidate candidate) {
		
		if(candidate.getBirthDate().equals(null)) {
			
			return false;
		}
		return true;
	}
	
	public boolean emailNullChecker(Candidate candidate) {
		
		if(candidate.getEmail().isBlank() || candidate.getEmail().equals(null) ) {
			
			return false;
		}
		return true;
	}
	
	public boolean passwordNullChecker(Candidate candidate) { 
		
		if(candidate.getPassword().isBlank() || candidate.getPassword().equals(null) ) {
			
			return false;
		}
		return true;
	}
	
	
	public boolean isRealEmail(Candidate candidate) {
		
		String regex="^(.+)@(.+)$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(candidate.getEmail());
		if(!matcher.matches()) {
			
			return false;
			
		}
		return true;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll()," İş arayanlar başarıyla listelendi.");
	}

	
	
}
