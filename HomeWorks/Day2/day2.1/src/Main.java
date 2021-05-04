
public class Main {

	public static void main(String[] args) {

		Instructor instructor1 = new Instructor();

		instructor1.id = 101;
		instructor1.name = "Engin";
		instructor1.surName = "Demirog";

		Instructor instructor2 = new Instructor(102, "Halil", "Daðdelen");

		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý2 ", "Engýn Demýrog", "(C# + Angular)", 0);

		Course course2 = new Course();

		course2.id = 2;
		course2.name = "Yazýlým Geliþtirici Yetiþtirme Kampý2 ";
		course2.instructor = "Engýn Demýrog";
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

		InstructorManager ýnstructorManager = new InstructorManager();
		ýnstructorManager.addInstructor(instructor2);
		ýnstructorManager.deleteInstructor(instructor1);

	}

}
