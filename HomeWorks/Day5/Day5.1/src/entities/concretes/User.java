package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {
	
	private int id;
	private String firstName;
	private String latsName;
	private String email;
	private String password;
	
	public User() {
		
		
		
	}

	public User(int id, String firstName, String latsName, String email, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.latsName = latsName;
		this.email = email;
		this.password = password;
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

	public String getLatsName() {
		return latsName;
	}

	public void setLatsName(String latsName) {
		this.latsName = latsName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
