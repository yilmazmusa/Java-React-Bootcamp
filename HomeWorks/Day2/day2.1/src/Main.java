
public class Main {

	public static void main(String[] args) {

		Instructor instructor1 = new Instructor();

		instructor1.id = 101;
		instructor1.name = "Engin";
		instructor1.surName = "Demirog";

		Instructor instructor2 = new Instructor(102, "Halil", "Da�delen");

		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�2 ", "Eng�n Dem�rog", "(C# + Angular)", 0);

		Course course2 = new Course();

		course2.id = 2;
		course2.name = "Yaz�l�m Geli�tirici Yeti�tirme Kamp�2 ";
		course2.instructor = "Eng�n Dem�rog";
		course2.detail = "(Java + React)";
		course2.price = 0;

		Instructor[] instructors = { instructor1, instructor2 };

		Course[] courses = { course1, course2 };

		for (Instructor instructor : instructors) {

			System.out.println(instructor.name + " " + instructor.surName);

		}

		for (Course course : courses) {

			System.out.println(course.name + course.detail + " -- " + course.instructor);

		}

		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.deleteCourse(course2);

		InstructorManager �nstructorManager = new InstructorManager();
		�nstructorManager.addInstructor(instructor2);
		�nstructorManager.deleteInstructor(instructor1);

	}

}
