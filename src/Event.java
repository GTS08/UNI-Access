import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Event {
	private String courseCode;
	private Date startDate;
	private Date endDate;
	private Student[] participants;
	private Teacher createdBy;
	private Room room;
	private Course course;

	public Event(String courseCode, Date startDate, Date endDate, Student[] participants, Teacher createdBy, Room room,
			Course course) {
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	private boolean isOnProgress(Student student) {
		Random rand = new Random();
		int randonNum = rand.nextInt(100);

		if (randonNum <= 90) {
			return true;
		}
		return false;
	}

	private boolean isPresent(Student student) {
		Random rand = new Random();
		int randonNum = rand.nextInt(100);

		if (randonNum <= 90) {
			return true;
		}
		return false;
	}

	public Student[] presentStudents() {

		List<Student> attended = new ArrayList<>();

		for (int i = 0; i < participants.length; i++) {
			if (isOnProgress(participants[i]) && isPresent(participants[i])) {
				attended.add(participants[i]);
			}
		}

		Student[] attendedArray = new Student[attended.size()];
		attended.toArray(attendedArray);

		return attendedArray;

	}

}
