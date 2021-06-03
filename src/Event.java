import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
	public Event(String courseCode, LocalDateTime startDate, LocalDateTime endDate, Student[] participants,
			Teacher createdBy, Room room, Course course) {
		this.setCourseCode(courseCode);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setParticipants(participants);
		this.setCreatedBy(createdBy);
		this.setRoom(room);
	}

	// Constructor for Lab, Exam
	public Event(String courseCode, LocalDateTime startDate, LocalDateTime endDate, Student[] participants,
			Teacher createdBy, Room room, Course course, long timeout) {
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

	public boolean isOnProgress(Student student) {
		Random rand = new Random();
		int randonNum = rand.nextInt(100);

		if (randonNum <= 90) {
			return true;
		}
		return false;
	}

	public boolean isPresent(Student student) {
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

	public void findCourseLog(String courseCode, LocalDateTime startDate, LocalDateTime endDate, Room room) {
		System.out.println(courseCode.toString());
		System.out.println(startDate.toString());
		System.out.println(endDate.toString());
		System.out.println(room.getTitle());

		ArrayList<String> courseLog = new ArrayList<String>();
		courseLog.add(courseCode.toString());
		courseLog.add(startDate.toString());
		courseLog.add(endDate.toString());
		courseLog.add(room.getTitle());

		System.out.println("Course Log: " + courseLog);
	}

	public List<String> hoursOccupiedMonday = new ArrayList<>();
	public List<String> hoursOccupiedTuesday = new ArrayList<>();
	public List<String> hoursOccupiedWednesday = new ArrayList<>();
	public List<String> hoursOccupiedThursday = new ArrayList<>();
	public List<String> hoursOccupiedFriday = new ArrayList<>();

	public List<String> roomHoursOccupied(Room eventRoom, String dayOfTheWeek, Event[] events) {
		if (dayOfTheWeek == "MONDAY") {
			for (int i = 0; i < events.length; i++) {
				if (events[i].room == eventRoom && events[i].startDate.getDayOfWeek().toString() == dayOfTheWeek) {
					String hour = String.valueOf(events[i].startDate.getHour());
					hour = hour + '-' + String.valueOf(events[i].endDate.getHour());
					hoursOccupiedMonday.add(hour);
				}
			}
			if (hoursOccupiedMonday.isEmpty()) {
				hoursOccupiedMonday.add("All hours available");
			}
			return hoursOccupiedMonday;
		} else if (dayOfTheWeek == "TUESDAY") {
			for (int i = 0; i < events.length; i++) {
				if (events[i].room == eventRoom && events[i].startDate.getDayOfWeek().toString() == dayOfTheWeek) {
					String hour = String.valueOf(events[i].startDate.getHour());
					hour = hour + '-' + String.valueOf(events[i].endDate.getHour());
					hoursOccupiedTuesday.add(hour);
				}
			}
			if (hoursOccupiedTuesday.isEmpty()) {
				hoursOccupiedTuesday.add("All hours available");
			}
			return hoursOccupiedTuesday;
		} else if (dayOfTheWeek == "WEDNESDAY") {
			for (int i = 0; i < events.length; i++) {
				if (events[i].room == eventRoom && events[i].startDate.getDayOfWeek().toString() == dayOfTheWeek) {
					String hour = String.valueOf(events[i].startDate.getHour());
					hour = hour + '-' + String.valueOf(events[i].endDate.getHour());
					hoursOccupiedWednesday.add(hour);
				}
			}
			if (hoursOccupiedWednesday.isEmpty()) {
				hoursOccupiedWednesday.add("All hours available");
			}
			return hoursOccupiedWednesday;
		} else if (dayOfTheWeek == "THURSDAY") {
			for (int i = 0; i < events.length; i++) {
				if (events[i].room == eventRoom && events[i].startDate.getDayOfWeek().toString() == dayOfTheWeek) {
					String hour = String.valueOf(events[i].startDate.getHour());
					hour = hour + '-' + String.valueOf(events[i].endDate.getHour());
					hoursOccupiedThursday.add(hour);
				}
			}
			if (hoursOccupiedThursday.isEmpty()) {
				hoursOccupiedThursday.add("All hours available");
			}
			return hoursOccupiedThursday;
		} else if (dayOfTheWeek == "FRIDAY") {
			for (int i = 0; i < events.length; i++) {
				if (events[i].room == eventRoom && events[i].startDate.getDayOfWeek().toString() == dayOfTheWeek) {
					String hour = String.valueOf(events[i].startDate.getHour());
					hour = hour + '-' + String.valueOf(events[i].endDate.getHour());
					hoursOccupiedFriday.add(hour);
				}
			}
			if (hoursOccupiedFriday.isEmpty()) {
				hoursOccupiedFriday.add("All hours available");
			}
			return hoursOccupiedFriday;
		} else {
			List<String> errorMessage = new ArrayList<>();
			errorMessage.add("No data");

			return errorMessage;
		}
	}

	public void reserveRoom(Room eventRoom, LocalDateTime dateTimeStart, LocalDateTime dateTimeEnd) {
		if (dateTimeStart.getDayOfWeek().toString() == "MONDAY") {
			String hour;
			String startHour = String.valueOf(dateTimeStart.getHour());
			String endHour = String.valueOf(dateTimeEnd.getHour());
			hour = startHour + '-' + endHour;
			hoursOccupiedMonday.add(hour);
		}

		if (dateTimeStart.getDayOfWeek().toString() == "TUESDAY") {
			String hour;
			String startHour = String.valueOf(dateTimeStart.getHour());
			String endHour = String.valueOf(dateTimeEnd.getHour());
			hour = startHour + '-' + endHour;
			hoursOccupiedTuesday.add(hour);
		}

		if (dateTimeStart.getDayOfWeek().toString() == "WEDNESDAY") {
			String hour;
			String startHour = String.valueOf(dateTimeStart.getHour());
			String endHour = String.valueOf(dateTimeEnd.getHour());
			hour = startHour + '-' + endHour;
			hoursOccupiedWednesday.add(hour);
		}

		if (dateTimeStart.getDayOfWeek().toString() == "THURSDAY") {
			String hour;
			String startHour = String.valueOf(dateTimeStart.getHour());
			String endHour = String.valueOf(dateTimeEnd.getHour());
			hour = startHour + '-' + endHour;
			hoursOccupiedThursday.add(hour);
		}

		if (dateTimeStart.getDayOfWeek().toString() == "FRIDAY") {
			String hour;
			String startHour = String.valueOf(dateTimeStart.getHour());
			String endHour = String.valueOf(dateTimeEnd.getHour());
			hour = startHour + '-' + endHour;
			hoursOccupiedFriday.add(hour);
		}
	}

}
