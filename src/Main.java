import java.time.LocalDateTime;
import java.time.Month;

public class Main {

	public static void main(String[] args) {

		// Test the classes

		// Test my-methods
		// ==============================================================================================================
		// dummy data
		String[] testCourses = {"Software Engineering", "Advanced Microprocessors"};
		Student testStudent1 = new Student("Christos", "Pelekis", "cpelekis", "123456789", 1, 2017, testCourses, 0);
		Student testStudent2 = new Student("Leonidas", "Tsantarliotis", "ltsantarliotis", "123456789", 2, 2017, testCourses, 0);		
		Student testStudent3 = new Student("Georgios", "Thomas", "gthomas", "123456789", 3, 2017, testCourses, 0);		
		Scanner testScanner = new Scanner();
		LocalDateTime startDate = LocalDateTime.of(2021, Month.MAY, 21, 12, 0, 0);
		LocalDateTime endDate = LocalDateTime.of(2021, Month.MAY, 21, 14, 0, 0);
		Student[] participants = {testStudent1, testStudent2};
		Teacher testTeacher = new Teacher("Nikos", "Nikolopoulos", "nnikolopoulos", "123456789", testCourses);
		Room testRoom = new Room(20, true);
		Course testCourse = new Course("CEID1234", "Advanced Microprocessors Lab", 2, 4, true, true);
		Student[] testAbsentLog = {testStudent1, testStudent2};
		
		Lab testEvent = new Lab("CEID1234", startDate, endDate, participants, testTeacher, testRoom,
				testCourse, testAbsentLog, 15);
		if (testScanner.isValidStudent(testStudent1)) { // validation is random
			testScanner.isExpectedStudent(testStudent1,testEvent);
		}		
		// ==============================================================================================================

		
	}

}
