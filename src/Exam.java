import java.util.Date;

public class Exam extends Event {
	private Student[] absentLog;
	private int timeout;

	Exam(String courseCode, Date startDate, Date endDate, Student[] participants, Teacher createdBy, Room room,
			Student[] absentLog, int timeout) {
		super(courseCode, startDate, endDate, participants, createdBy, room);
		this.setAbsentLog(absentLog);
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
