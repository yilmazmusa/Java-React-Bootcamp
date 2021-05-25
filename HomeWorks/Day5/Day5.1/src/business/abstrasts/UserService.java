package business.abstrasts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	List<User> getAll();
	
	void userVerify(User user, int verificationcode);
	

}
