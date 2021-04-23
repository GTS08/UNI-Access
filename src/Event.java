import java.util.Date;

public class Event {
	private String courseCode;
	private Date startDate;
	private Date endDate;
	private Student[] participants;
	private Teacher createdBy;
	private Room room;

	public Event(String courseCode, Date startDate, Date endDate, Student[] participants, Teacher createdBy,
			Room room) {
		this.setCourseCode(courseCode);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setParticipants(participants);
		this.setCreatedBy(createdBy);
		this.setRoom(room);
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Student[] getParticipants() {
		return participants;
	}

	public void setParticipants(Student[] participants) {
		this.participants = participants;
	}

	public Teacher getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Teacher createdBy) {
		this.createdBy = createdBy;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

}
