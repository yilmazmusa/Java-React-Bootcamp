
public class Main {

	public static void main(String[] args) {

		Student student = new Student(1, "Musa", "Yılmaz", 25, "musayilmaz@gmail.com", 
				"******", "142101", "Bilgisayar Mühendisliği","Süleyman Demirel Univercity","çok güzel kurs");
		
		Instructor instructor =new Instructor(1, "Engin", "Demirog", 35, "engindemirog@gmail.com", "******", 10000, 25);
 		
		
	
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.update(student);
		studentManager.delete(student);
		studentManager.toComment(student);
		
		
		System.err.println(" ----- --- --------------- -------");
		
		
		InstructorManager ınstructorManager = new InstructorManager();
		ınstructorManager.add(instructor);
		ınstructorManager.update(instructor);
		ınstructorManager.delete(instructor);
		
		
		

}

}
