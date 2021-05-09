
public class InstructorManager {

public void add(Instructor instructor) {
		
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli egitmen eklendi.");
	}

	public void update(Instructor instructor) {
		
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli egitmen bilgileri güncellendi." );
	
	}
	public void delete(Instructor instructor) {
		
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli egitmen silindi ");
		
	}
	
}
