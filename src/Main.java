public class Main {

	public static void main(String[] args) {

		// Test the classes

		// Test my-methods
		// ==============================================================================================================
		// Test isValidStudent()
		String[] testCourses = {"Software Engineering", "Advanced Microprocessors"};
		Student testStudent = new Student("Christos", "Pelekis", "cpelekis", "123456789", 1, 2017, testCourses, 0);		
		Scanner testScanner = new Scanner();
		testScanner.isValidStudent(testStudent);
		// ==============================================================================================================

		
	}

}
