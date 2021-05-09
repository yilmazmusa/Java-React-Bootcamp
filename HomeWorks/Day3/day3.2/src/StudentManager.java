
public class StudentManager {
	
	public void add(Student student) {
		
		System.out.println(student.getStudentNumber() + " " + student.getFirstName() + " " +student.getLastName() + " isimli öğrenci eklendi");
		
	}

	public void update(Student student) {
		
		System.out.println(student.getStudentNumber() + "" +student.getFirstName() + " " + student.getLastName() + " isimli öğrenci güncellendi");
	}
	
	public void delete(Student student) {
		
		System.out.println(student.getStudentNumber() + " " + student.getFirstName() + " " + student.getLastName() + " isimli öğrenci silindi");
		
	}
	
	public void toComment(Student student) {
		
		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getToComment() + " yorumunu yaptı "  ); 
			
		
		
		}
	
}
