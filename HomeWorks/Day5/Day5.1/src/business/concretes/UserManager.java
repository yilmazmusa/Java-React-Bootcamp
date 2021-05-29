package business.concretes;

import java.util.ArrayList;
import java.util.List;


import business.abstrasts.AuthService;
import business.abstrasts.EmailService;
import business.abstrasts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
		
	private UserDao userDao;
	private AuthService authService;
	private EmailService emailService;

	public UserManager(UserDao userDao, AuthService authService, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
		this.emailService = emailService;
		
	}
	
	List<User> users= new ArrayList<User>();
	
	public UserManager() {
		
		users.add((User) this.getAll());
	}

	@Override
	public void add(User user) {
		
		if(userCheck(user.getEmail()) && authService.validate(user)) {
			
			userDao.add(user);
			System.out.println("Doðrulama Kodunuz Gönderildi: " + emailService.emailSend());
			System.out.println("Doðrulama Kodunu Giriniz: ");
			return;
			
		}
		System.out.println("Bilgilerinizi kotrol ediniz!!");
		
	}

	@Override
	public void update(User user) {
		
		this.userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		
		this.userDao.delete(user);
	}

	@Override
	public User get(int id) {
		User result=this.userDao.get(id);
		return result;
	}

	@Override
	public List<User> getAll() {
		
		
		List<User> result= this.userDao.getAll();
		return result;
	}

	@Override
	public void userVerify(User user, int verificationcode) {
		
		int code=emailService.emailSend();
		
		if(code ==verificationcode) {
			
			System.out.println("Kullanýcý Doðrulandý.Tebrikle baþarlýlý üye oldunuz: " + user.getFirstName()+ " " + user.getLatsName());
		}
		else {
			
			System.out.println("Doðrulama kodu yanlýþ girildi.Lütfen kontrol ediniz!!");
		}
		
	}
	
	public boolean userCheck(String email) {
		if(userDao.getEmail(email) != null ) {
		
			System.out.println("Bu e-posta ile Kullanýcý mevcut");
			return false;
			}
		
		return true;
	}
	
	
	
}
