package business.concretes;

import java.util.regex.Pattern;

import business.abstrasts.AuthService;
import entities.concretes.User;
import core.utilities.BusinessRules;

public class AuthManager implements AuthService {
	
	public static final  Pattern validEmail = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[gmail|hotmail|mail]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$", Pattern.CASE_INSENSITIVE);
	

	@Override
	public boolean login(User user) {
		
		boolean result = BusinessRules.Run(emailAndPasswordCheck(user));
		return result;
	}

	@Override
	public boolean validate(User user) {
		
		boolean result = BusinessRules.Run(fistNameCheck(user), lastNameCheck(user), passwordCheck(user),
				emailFormatCheck(user));
		return result;
		
	}
	
	private boolean passwordCheck(User user) {
		
		if(user.getPassword().length() >=6) {
			return true;
			
		}
		System.out.println("Kullanýcý þifresi en az 6 karakter olmalýdýr");
		return false; 	
	}
	
	
	private boolean fistNameCheck(User user) {
		
		if(!user.getFirstName().isEmpty()) {
		
			if(user.getFirstName().length()>= 2) {
			
			return true;
			
		}
		
		else {
		System.out.println("Kullanýcý ismi en az 2 karakter olmalýdýr");
		return false;
		
		}
	
	
	}
			System.out.println("Ýsim boþ býrakýlamaz");
			return false;	

}
	
	private boolean lastNameCheck(User user) {
		
		if(!user.getLatsName().isEmpty()) {
			
			if(user.getLatsName().length()>=2) {
				return true;
			}
		else {
			System.out.println("Kullanýcý soyismi en az 2 karakter olmalýdýr");
			return false;
		}
		}
		
		System.out.println("Soyisim boþ býrakýlamaz.");
		return false;

	}
	
	
	private boolean emailFormatCheck(User user) {
		
		if(!validEmail.matcher(user.getEmail()).find()) {
		
			System.out.println("Lütfen geçerli bir email girin");
			return false;
			
		}
		return true;
		
		
		
	}
	
	private boolean emailAndPasswordCheck(User user) {
		
		if(user.getEmail().isEmpty() || user.getPassword().isEmpty()) {
			System.out.println("Email veya Parola eksik!!");
			return false;
		}
		
		System.out.println("Sisteme baþarýlý bir þekilde giriþ yapýldý");
		return true;
		
		
	}
	
}
	
