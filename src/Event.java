import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.time.LocalDateTime;

public class Event {
	private String courseCode;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private Student[] participants;
	private Teacher createdBy;
	private Room room;
	private Course course;
	private long timeout;

	// Constructor for Lecture
	public Event(String courseCode, LocalDateTime startDate, LocalDateTime endDate, Student[] participants, Teacher createdBy, Room room,
			Course course) {
		this.setCourseCode(courseCode);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setParticipants(participants);
		this.setCreatedBy(createdBy);
		this.setRoom(room);		
	}
	
	// Constructor for Lab, Exam
	public Event(String courseCode, LocalDateTime startDate, LocalDateTime endDate, Student[] participants, Teacher createdBy, Room room,
			Course course, long timeout) {
		this.setCourseCode(courseCode);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setParticipants(participants);
		this.setCreatedBy(createdBy);
		this.setRoom(room);
		this.setTimeout(timeout);
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
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

	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}
	
	public long getTimeout() {
		return timeout;
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
	 public void findCourseLog(String courseCode,LocalDateTime startDate,LocalDateTime endDate,Room room ){
		    System.out.println(courseCode.toString());
		    System.out.println(startDate.toString());
		    System.out.println(endDate.toString());
		    System.out.println(room.toString());

		    ArrayList<String> courseLog = new ArrayList<String>();
		    courseLog.add(courseCode.toString());
		    courseLog.add(startDate.toString());
		    courseLog.add(endDate.toString());
		    courseLog.add(room.toString());

		    System.out.println("Course Log: " +courseLog);
		  }

}
