
public class UserManager {

	public void add(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() +  "kullan�c�s� eklendi.");
	}
	
	public void update(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() +  "isimli kullan�c�n�n bilgileri g�ncellendi.");
	}

	public void delete(User user) {
	
	System.out.println(user.getFirstName() + " " + user.getLastName() +  "kullan�c�s� silindi.");
    
	}
	
}
