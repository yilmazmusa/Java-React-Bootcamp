package business.abstrasts;

import entities.concretes.User;

public interface AuthService {
	
	boolean login(User user);
	
	boolean validate(User user);

}
