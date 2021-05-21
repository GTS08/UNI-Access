import java.time.LocalDateTime;

public class Exam extends Event {
	private Student[] absentLog;
	private int timeout;

	Exam(String courseCode, LocalDateTime startDate, LocalDateTime endDate, Student[] participants, Teacher createdBy, Room room,
			Course course, Student[] absentLog, long timeout) {
		super(courseCode, startDate, endDate, participants, createdBy, room, course, timeout);
		this.setTimeout(timeout);
	}

	public Student[] getAbsentLog() {
		return absentLog;
	}

	public void setAbsentLog(Student[] absentLog) {
		this.absentLog = absentLog;
	}
}
