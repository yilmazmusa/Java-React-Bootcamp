
public class Main {

	public static void main(String[] args) {

		Student student = new Student(1, "Musa", "Y�lmaz", 25, "musayilmaz@gmail.com", 
				"******", "142101", "Bilgisayar M�hendisli�i","S�leyman Demirel Univercity","�ok g�zel kurs");
		
		Instructor instructor =new Instructor(1, "Engin", "Demirog", 35, "engindemirog@gmail.com", "******", 10000, 25);
		
		
	
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.update(student);
		studentManager.delete(student);
		
		
		System.err.println("        ----- --- ------      --------- -------");
		
		
		InstructorManager �nstructorManager = new InstructorManager();
		�nstructorManager.add(instructor);
		�nstructorManager.update(instructor);
		�nstructorManager.delete(instructor);
		
		
		

}

}
