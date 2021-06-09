package kodlamaio.hrms.FakeMernis;

import kodlamaio.hrms.entities.concretes.Candidate;

public class UserValidationManager implements UserValidationService{

	@Override
	public boolean validate(Candidate candidate) {
		if (candidate.getFirstName()=="Musa" &&
				candidate.getIdentificationNumber()=="17843648701") {
			
			return true;
			
		}
		else {
			
			return false;
		    }
		
	}

	
	
}
