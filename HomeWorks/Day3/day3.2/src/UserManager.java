
public class UserManager {

	public void add(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() +  "kullanıcısı eklendi.");
	}
	
	public void update(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() +  "isimli kullanıcının bilgileri güncellendi.");
	}

	public void delete(User user) {
	
	System.out.println(user.getFirstName() + " " + user.getLastName() +  "kullanıcısı silindi.");
    
	}
	
}
