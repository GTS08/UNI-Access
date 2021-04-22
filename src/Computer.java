public class Computer {

	private int id;
	private boolean status;
	private Student loggedStudent;
	private Student bookedBy;

	public Student getLoggedStudent() {
		return loggedStudent;
	}

	public void setLoggedStudent(Student loggedStudent) {
		this.loggedStudent = loggedStudent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Student getBookedBy() {
		return bookedBy;
	}

	public void setBookedBy(Student bookedBy) {
		this.bookedBy = bookedBy;
	}
	
}
