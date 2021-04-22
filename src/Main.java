public class Main {

	public static void main(String[] args) {
		User GeorgeUser = new User("George", "Thomas", "gthomas", "gthomas1999");
		
		

		System.out.println("Username: " + GeorgeUser.getFirstName());
		System.out.println("Username: " + GeorgeUser.getLastName());
		System.out.println("Username: " + GeorgeUser.getUsername());
		System.out.println("Username: " + GeorgeUser.getPassword());

		String[] studentCourses = { "Software Engineering", "Web" };

		Student GeorgeStudent = new Student("George", "Thomas", "gthomas", "gthomas1999", 1064973, 2017, studentCourses,
				5);

		System.out.println("Registration Number: " + GeorgeStudent.getRegNo());
		System.out.println("Registration Year: " + GeorgeStudent.getRegYear());
		System.out.print("Courses: ");
		for (int i = 0; i < GeorgeStudent.getStudentCourses().length; i++) {
			System.out.print(studentCourses[i]);
			if (i < GeorgeStudent.getStudentCourses().length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("\n");
		System.out.println("Number of PC thats booked: " + GeorgeStudent.getBookedPC());
		/* NOT FUNCTIONAL YET
		
		// Event of the university
		Event RandomEvent = new Event("5","NYCEID420","300","startDate"."endDate","BA");
		
		// Instantiate a Date object
	    Date startDate = new Date();
	    Date endDate = new Date();

	    // display time and date using toString()
	    System.out.print("\n");
	    System.out.println("Start date of an event: " + RandomEvent.startDate.toString());
	    System.out.println("End date of an event: " + RandomEvent.endDate.toString());
	    
	    */ 
	   }
	}

