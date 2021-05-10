package interfaces;

public class Customer {

	private int id;
	private String firstName;
	private String lastNme;
	
	public Customer() {
		
		
	}

	public Customer(int id, String firstName, String lastNme) {
	
		this.id = id;
		this.firstName = firstName;
		this.lastNme = lastNme;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastNme() {
		return lastNme;
	}

	public void setLastNme(String lastNme) {
		this.lastNme = lastNme;
	}
	
	
	
}

