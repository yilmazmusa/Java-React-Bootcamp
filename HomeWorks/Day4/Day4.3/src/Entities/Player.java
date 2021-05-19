package Entities;

public class Player {
	
	private int id;
	private String name;
	private String lastName;
	private String nationalityId;
	private String dateOfBird;

	
public  Player() {
		
		
	}


public Player(int id, String name, String lastName, String nationalityId, String dateOfBird) {
	super();
	this.id = id;
	this.name = name;
	this.lastName = lastName;
	this.nationalityId = nationalityId;
	this.dateOfBird = dateOfBird;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public String getNationalityId() {
	return nationalityId;
}


public void setNationalityId(String nationalityId) {
	this.nationalityId = nationalityId;
}


public String getDateOfBird() {
	return dateOfBird;
}


public void setDateOfBird(String dateOfBird) {
	this.dateOfBird = dateOfBird;
}
	
	
	
	
	
	
	
	
}


	
