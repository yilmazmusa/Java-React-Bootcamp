package signUpWithGoogle;

public class Register {
	
	public boolean register(int id,String firstName,String lastName,String email,String password) {
		
		if (firstName.length()>2 && lastName.length()>2&&email.length()>=6&&password.length()>=6) {
			return true;
		}
		return false;	
	}
		
		
		
	

}
