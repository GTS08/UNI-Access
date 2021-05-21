import java.time.LocalDateTime;
import java.time.Month;

public class Main {

	public static void main(String[] args) {

		// Test the classes

		// test christos methods
		// ==============================================================================================================
		// dummy data
		String[] testCourses = {"Software Engineering", "Advanced Microprocessors"};
		Department ceid = new Department("Computer Engineering & Informatics Department");
		Student testStudent1 = new Student("Christos", "Pelekis", "cpelekis", "123456789", 0, 2017, testCourses, 0, ceid);
		Student testStudent2 = new Student("Leonidas", "Tsantarliotis", "ltsantarliotis", "123456789", 1, 2017, testCourses, 0, ceid);		
		Student testStudent3 = new Student("Georgios", "Thomas", "gthomas", "123456789", 2, 2017, testCourses, 0, ceid);		
		Scanner testScanner = new Scanner();
		LocalDateTime startDate = LocalDateTime.of(2021, Month.MAY, 21, 16, 44, 0); // 2021, May, 21, 16:45:00
		LocalDateTime endDate = LocalDateTime.of(2021, Month.MAY, 21, 18, 0, 0); // 2021, May, 21, 18:00:00
		Student[] participants = {testStudent1, testStudent2};
		Teacher testTeacher = new Teacher("Nikos", "Nikolopoulos", "nnikolopoulos", "123456789", testCourses, ceid);
		Room testRoom = new Room(20, true, ceid, "B4");
		Course testCourse = new Course("CEID1234", "Advanced Microprocessors Lab", 2, 4, true, true, ceid);
		Student[] testAbsentLog = {testStudent1, testStudent2};		
		Lab testEvent = new Lab("CEID1234", startDate, endDate, participants, testTeacher, testRoom,
				testCourse, testAbsentLog, 15);
		
		// validation is random, expected students are testStudent1 and 2 
		if (testScanner.isValidStudent(testStudent3) && testScanner.isExpectedStudent(testStudent3, testEvent)) { // validation is random
			testScanner.isLateStudent(testEvent);
		}	
		
		testEvent.findCourseLog("CEID1234",startDate,endDate,testRoom);
		// ==============================================================================================================

		
	}

}
