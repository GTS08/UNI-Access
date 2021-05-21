public class Teacher extends User{

	private String[] teacherCourses;
	
	public Teacher(String firstName, String lastName, String username, String password, String[] teacherCourses, Department dep) {
		super(firstName, lastName, username, password, dep);
		this.setTeacherCourses(teacherCourses);
	}
	
	public String[] getTeacherCourses() {
		return teacherCourses;
	}
	
	public void setTeacherCourses(String[] teacherCourses) {
		this.teacherCourses = teacherCourses;
	}	
}
