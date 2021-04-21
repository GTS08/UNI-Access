public class Main {

	public static void main(String[] args) {
		User George = new User("George", "Thomas", "gthomas", "gthomas1999");

		System.out.println("Username: " + George.getFirstName());
		System.out.println("Username: " + George.getLastName());
		System.out.println("Username: " + George.getUsername());
		System.out.println("Username: " + George.getPassword());

		Student George = new User(1064973, 2017, studentCourses[7], 5 );

		System.out.println("Registration Number: " + George.getRegNo());
		System.out.println("Registration Year: " + George.getRegYear());
		System.out.println("Student Courses: " + George.getStudentCourses());
		System.out.println("Number of PC thats booked: " + George.getBookedPC());

	}

}
