
public class Student extends User{
	
	
	private String studentNumber;
	private String department;
	private String university;
	private String toComment;
	
	
	
	public Student(int id, String firstName, String lastName, int age,String email,
			String password,String studentNumber,String department,String university,String toComment) {
		
		super(id, firstName, lastName, age, email, password);
		this.studentNumber=studentNumber;
		this.department=department;
		this.university=university;
		this.toComment=toComment;
	}
	
	


	public String getStudentNumber() {
		return studentNumber;
	}


	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}




	public String getUniversity() {
		return university;
	}




	public void setUniversity(String university) {
		this.university = university;
	}




	public String getToComment() {
		return toComment;
	}




	public void setToComment(String toComment) {
		this.toComment = toComment;
	}




	
	
	

}
