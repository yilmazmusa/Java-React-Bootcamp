package Entities;


import Abstract.Entitiy;

public class Customer implements Entitiy{
	
	private int id;
	private String fistName;
	private String lastName;
	private String dateOfBirth;
	private String nationalityId;

	
	public Customer() {
		
		
	}


	public Customer(int id, String fistName, String lastName, String dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.fistName = fistName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFistName() {
		return fistName;
	}


	public void setFistName(String fistName) {
		this.fistName = fistName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	
}


//�imdi burda Starbuck m��retiyi kaydetmek i�in MERS�S do�rulamas� istiyor.
//Burda abstract veya interface ile yazamay�z ��nk� Neroda MERN�S do�r�ulamas� istemiyor.Biz abstract veya interface
//ile yazarsak Neroda zorunlu almak zorunda kal�r o y�zden bu ikisiyle yazamay�z