public class Student extends User {
	// private attributes of Student
	private int regNo;
	private int regYear;
	private String[] studentCourses;
	private int bookedPC;
	
	// constructor and super
	public Student(String firstName, String lastName, String username, String password, int regNo, int regYear,
			String[] studentCourses, int bookedPC) {
		super(firstName, lastName, username, password);
		this.setRegNo(regNo);
		this.setRegYear(regYear);
		this.setStudentCourses(studentCourses);
		this.setBookedPC(bookedPC);
	}
	//getters and setters for the Registration Number of Student
	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	//getters and setters for the Registration Year of Student
	public int getRegYear() {
		return regYear;
	}

	public void setRegYear(int regYear) {
		this.regYear = regYear;
	}
	//getters and setters for the Student's Courses
	public String[] getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(String[] studentCourses) {
		this.studentCourses = studentCourses;
	}
	//getters and setters for the PC booked by a Student
	public int getBookedPC() {
		return bookedPC;
	}

	public void setBookedPC(int bookedPC) {
		this.bookedPC = bookedPC;
	}

}

