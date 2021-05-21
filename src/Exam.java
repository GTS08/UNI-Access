import java.time.LocalDateTime;

public class Exam extends Event {
	private Student[] absentLog;
	private int timeout;

	Exam(String courseCode, LocalDateTime startDate, LocalDateTime endDate, Student[] participants, Teacher createdBy, Room room,
			Course course, Student[] absentLog, int timeout) {
		super(courseCode, startDate, endDate, participants, createdBy, room, course);
		this.setTimeout(timeout);
	}

	public Student[] getAbsentLog() {
		return absentLog;
	}

	public void setAbsentLog(Student[] absentLog) {
		this.absentLog = absentLog;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

}
