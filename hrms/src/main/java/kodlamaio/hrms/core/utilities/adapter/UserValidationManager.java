package kodlamaio.hrms.core.utilities.adapter;

import java.util.UUID;

import org.springframework.stereotype.Service;


@Service
public class UserValidationManager implements UserValidationService{

	@Override
	public void sendLink(String email) {
		
		UUID uuid = UUID.randomUUID();
		String verificationLink = "https://hrmsverificationmail/" + uuid.toString();
		System.out.println("Verification link has been sent to " + email );
		System.out.println("Please click on the link to verify your account:  " + verificationLink );
	}

	@Override
	public String sendCode() {

		UUID uuid = UUID.randomUUID();
		String verificationCode = uuid.toString();
		System.out.println("Your activation code:  " + verificationCode );
		return verificationCode;
	}

	
	
	
}
