package core.googleRegisterAdapter;

import business.abstrasts.AuthService;
import core.utilities.BusinessRules;
import entities.concretes.User;
import signUpWithGoogle.Register;


public class GoogleManager implements AuthService{
	
	Register register = new Register();
	
	
	

	@Override
	public boolean login(User user) {
		
		boolean result = register.register(user.getId(),user.getFirstName(),
				user.getLatsName(),user.getEmail(),user.getPassword());
		
		if(!result && !this.validate(user)) {
			
			System.out.println("Sisteme giriþ baþarýsýz!");
		}
		
		System.out.println("Sisteme giriþ baþarýlý bir þekilde yapýldý.");
		return true;
	}

	@Override
	public boolean validate(User user) {
		
		boolean result = BusinessRules.Run(emailAndPasswordCheck(user));
		return result;
	}

	public boolean emailAndPasswordCheck(User user) {
		
		if(user.getEmail().isEmpty() || user.getPassword().isEmpty()) {
			
			System.out.println("Kullanýcý adý veya parola eksik!!");
			return false;
		}
		
		System.out.println(user.getFirstName() + " " + user.getLatsName() + " isimli kullanýcý Google hesabý ile kayýt oldu" );
		return true;
	}
	
}
