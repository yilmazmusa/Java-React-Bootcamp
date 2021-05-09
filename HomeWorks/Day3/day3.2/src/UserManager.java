
public class UserManager {

	public void add(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() +  "kullanýcýsý eklendi.");
	}
	
	public void update(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() +  "isimli kullanýcýnýn bilgileri güncellendi.");
	}

	public void delete(User user) {
	
	System.out.println(user.getFirstName() + " " + user.getLastName() +  "kullanýcýsý silindi.");
    
	}
	
}
