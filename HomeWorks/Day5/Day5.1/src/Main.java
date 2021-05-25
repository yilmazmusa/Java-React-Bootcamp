

import java.util.Scanner;

import business.abstrasts.AuthService;
import business.concretes.EmailManager;
import business.concretes.AuthManager;
import business.abstrasts.UserService;
import business.concretes.UserManager;
import core.googleRegisterAdapter.GoogleManager;
import dataAccess.concretes.InMemoryUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		AuthService google= new GoogleManager();
		
		Scanner scan= new 	Scanner(System.in);
		
		User user1= new User();
		user1.setId(1);
		user1.setFirstName("Musa");
		user1.setLatsName("Yýlmaz");
		user1.setEmail("yilazmusa@gmail.com");
		user1.setPassword("123456789");
		
		User user2=new User();
		user2.setFirstName("Engin");
		user2.setLatsName("Demirog");
		user2.setEmail("engindemirog@gmail.com");
		user2.setPassword("123456123");
		
		UserService userService=new UserManager(new InMemoryUserDao(),new AuthManager(),new EmailManager());
		
		userService.getAll();
		
		
		
		
		
		google.login(user2);
			
			
		
		
		

	}

}
