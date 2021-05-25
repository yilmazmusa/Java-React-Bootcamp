package business.concretes;

import java.util.Random;

import business.abstrasts.EmailService;

public class EmailManager  implements EmailService{
	
	int verificationcode;
	
	public  EmailManager() {
		Random code= new Random();
		
		this.verificationcode=code.nextInt(1000)*10;
				
	}

	@Override
	public int emailSend() {
		
		return this.verificationcode;
	}

}
