public class Main {

	public static void main(String[] args) {

		User GeorgeUser = new User("George", "Thomas", "gthomas", "gthomas1999"); // User Object

		System.out.println("Username: " + GeorgeUser.getFirstName());
		System.out.println("Username: " + GeorgeUser.getLastName());
		System.out.println("Username: " + GeorgeUser.getUsername());
		System.out.println("Username: " + GeorgeUser.getPassword());

		String[] studentCourses = { "Software Engineering", "Web" };

		Student GeorgeStudent = new Student("George", "Thomas", "gthomas", "gthomas1999", 1064973, 2017, studentCourses,
				5); // Student Object

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

		/*
		 * NOT FUNCTIONAL YET
		 * 
		 * // Event of the university Event RandomEvent = new
		 * Event("5","NYCEID420","300","startDate"."endDate","BA");
		 * 
		 * // Instantiate a Date object Date startDate = new Date(); Date endDate = new
		 * Date();
		 * 
		 * // display time and date using toString() System.out.print("\n");
		 * System.out.println("Start date of an event: " +
		 * RandomEvent.startDate.toString());
		 * System.out.println("End date of an event: " +
		 * RandomEvent.endDate.toString());
		 * 
		 */
		CompAdmin LeoCompAdmin = new CompAdmin("Leonidas", "Tsantarliotis", "ltsantarliotis", "ltsantarliotis1999"); // Computer
																														// Admin
																														// Object

		System.out.println("Computer Admin Username: " + LeoCompAdmin.getFirstName());

		String[] openHours = { "9:00 - 12:00", "15:00 - 19:00" };

		CompCenter compCenter = new CompCenter("Operational", 0, 1, openHours); // Computer Center Object

		System.out.println("Computer Center Status: " + compCenter.getStatus());
		System.out.print("Computer Center Open Hours: ");
		for (int i = 0; i < openHours.length; i++) {
			System.out.print(openHours[i]);
			if (i < openHours.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("\n");

		Computer compObj = new Computer(); // Computer Object

		compObj.setLoggedStudent(GeorgeStudent);
		System.out.println("Logged Student: " + compObj.getLoggedStudent().getFirstName() + " "
				+ compObj.getLoggedStudent().getLastName());

	}

}
