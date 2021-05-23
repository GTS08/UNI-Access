import java.time.LocalDateTime;
import java.time.Month;

public class Main {

	public static void main(String[] args) {

		// Test the classes

		// test christos methods
		// ==============================================================================================================
		// dummy data
		String[] testCourses = { "Software Engineering", "Advanced Microprocessors" };
		Department ceid = new Department("Computer Engineering & Informatics Department");
		Student testStudent1 = new Student("Christos", "Pelekis", "cpelekis", "123456789", 0, 2017, testCourses, 0,
				ceid);
		Student testStudent2 = new Student("Leonidas", "Tsantarliotis", "ltsantarliotis", "123456789", 1, 2017,
				testCourses, 0, ceid);
		Student testStudent3 = new Student("Georgios", "Thomas", "gthomas", "123456789", 2, 2017, testCourses, 0, ceid);
		Scanner testScanner = new Scanner();
		LocalDateTime startDate = LocalDateTime.of(2021, Month.MAY, 21, 16, 44, 0); // 2021, May, 21, 16:45:00
		LocalDateTime endDate = LocalDateTime.of(2021, Month.MAY, 21, 18, 0, 0); // 2021, May, 21, 18:00:00
		LocalDateTime startDate2 = LocalDateTime.of(2021, Month.MAY, 21, 18, 0, 0);
		LocalDateTime endDate2 = LocalDateTime.of(2021, Month.MAY, 21, 19, 0, 0);
		LocalDateTime startDate3 = LocalDateTime.of(2021, Month.MAY, 20, 9, 0, 0);
		LocalDateTime endDate3 = LocalDateTime.of(2021, Month.MAY, 20, 11, 0, 0);
		Student[] participants = { testStudent1, testStudent2 };
		Teacher testTeacher = new Teacher("Nikos", "Nikolopoulos", "nnikolopoulos", "123456789", testCourses, ceid);
		Room testRoom = new Room(20, true, ceid, "B4");
		Course testCourse = new Course("CEID1234", "Advanced Microprocessors Lab", 2, 4, true, true, ceid);
		Student[] testAbsentLog = { testStudent1, testStudent2 };
		Lab testEvent = new Lab("CEID1234", startDate, endDate, participants, testTeacher, testRoom, testCourse,
				testAbsentLog, 15);

		// validation is random, expected students are testStudent1 and 2
		if (testScanner.isValidStudent(testStudent3) && testScanner.isExpectedStudent(testStudent3, testEvent)) { // validation
																													// is
																													// random
			testScanner.isLateStudent(testEvent);
		}

		testEvent.findCourseLog("CEID1234", startDate, endDate, testRoom);
		// ==============================================================================================================

		// test leo's methods
		// <==============================================================================================================
		Event Lesson1 = new Event("1", startDate, endDate, testAbsentLog, testTeacher, testRoom, testCourse);
		Event Lesson2 = new Event("2", startDate2, endDate2, testAbsentLog, testTeacher, testRoom, testCourse);
		Event Lesson3 = new Event("3", startDate3, endDate3, testAbsentLog, testTeacher, testRoom, testCourse);
		Event[] events = { Lesson1, Lesson2, Lesson3 };
		System.out.println("Hours occupied on Friday: " + Lesson1.roomHoursOccupied(testRoom, "FRIDAY", events));

		Lesson3.reserveRoom(testRoom, startDate3, endDate3);
		System.out.println("Hours occupied on Thursday: " + Lesson3.hoursOccupiedThursday);
		System.out.println("Rooms occupied by " + testTeacher.getFirstName() + " on Friday: "
				+ testRoom.getTeacherRooms(testTeacher, "FRIDAY", events));
		testRoom.deleteReservedRoom(testRoom, startDate, endDate, events);
		System.out.println("Hours occupied on Friday after deleteReservedRoom(): " + Lesson1.hoursOccupiedFriday);
		// ==============================================================================================================>
	}

}
