
public class Instructor  extends User {
	
	
	private double salary;
	private int experience;
	
	
	public Instructor(int id, String firstName, String lastName, int age,
			String email, String password,double salary,int experience) {
		super(id, firstName, lastName, age, email, password);
		
		this.salary=salary;
		this.experience=experience;
		
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}
	

	
}
