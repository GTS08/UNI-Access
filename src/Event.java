public class Event extends Teacher {
	private String courseCode;
	private String[] participants; 
	private Date startDate;
	private Date endDate;
	private String room;
	
	public Event(String[] teacherCourses, String courseCode, String[] participants, Date startDate, Date endDate, String room)){
		super(teacherCourses);
		this.setCourseCode(courseCode);
		this.setParticipants(participants);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setRoom(room);
	}
	public int getCourseCode() {
		return courseCode;
	}
	public int setCourseCode() {
		return courseCode;
	}
	public int getParticipants() {
		return participants;
	}
	public int setParticipants() {
		return participants;
	}
	public int getStartDate() {
		return startDate;
	}
	public int setStartDate() {
		return startDate;
	}
	public int getEndDate() {
		return endDate;
	}
	public int setEndDate() {
		return endDate;
	}
	public int getRoom() {
		return room;
	}
	public int setRoom() {
		return room;
	}

}
