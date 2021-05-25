package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	
	List<User> users= new ArrayList<User>();
	
	public  InMemoryUserDao() {
		 
		System.out.println("Kullanýcýlar");
		
		User user1 = new User(1,"Engin","Demirog","engindemirog@gmail.com","engin123");
		User user2 = new User(2,"Musa","Yýlmaz","yilmazmusa@gmail.com","1223456");
		
		users.add(user1);
		users.add(user2);
		
	}

	@Override
	public void add(User user) {
		
		System.out.println(user.getFirstName() + user.getLatsName() + "  kullanýcýsý eklendi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() +  user.getLatsName() + "  kullanýcýsý bilgisi güncellendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + user.getLatsName() + "  kullanýcýsý silindi");
		
	}

	@Override
	public User get(int id) {
		
		User user=users.stream().filter(u->u.getId()==id).findFirst().orElse(null);
		System.out.println("Kullanýcý adý: " + user.getFirstName());
		return user;
		
	}

	@Override
	public List<User> getAll() {
		
		for (User user : users) {
			
			System.out.println(user.getFirstName() + " " + user.getLatsName());			
		}
		System.out.println("----------------");
		return users;
		
	}

	@Override
	public User getEmail(String email) {
		
		User user=users.stream().filter(u->u.getEmail()==email).findFirst().orElse(null);
		return user;
	}

	
	
}
