
public class StudentManager {
	
	public void add(Student student) {
		
		System.out.println(student.getStudentNumber() + " " + student.getFirstName() + " " +student.getLastName() + " isimli ��renci eklendi");
		
	}

	public void update(Student student) {
		
		System.out.println(student.getStudentNumber() + "" +student.getFirstName() + " " + student.getLastName() + " isimli ��renci g�ncellendi");
	}
	
	public void delete(Student student) {
		
		System.out.println(student.getStudentNumber() + " " + student.getFirstName() + " " + student.getLastName() + " isimli ��renci silindi");
		
	}
	
	public void toComment(Student student) {
		
		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getToComment() + " yorumunu yapt� "  ); 
			
		
		
		}
	
}
