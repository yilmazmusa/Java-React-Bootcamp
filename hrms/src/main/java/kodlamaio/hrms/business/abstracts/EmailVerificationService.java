package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.VerificationCode;

public interface EmailVerificationService {
	
	void generateCode(VerificationCode code, Integer id);
	Result verify(String verificationCode, Integer id);

}
