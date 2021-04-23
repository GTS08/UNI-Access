import java.util.Date;

public class Lecture extends Event {
	private int currentViewers;

	Lecture(String courseCode, Date startDate, Date endDate, Student[] participants, Teacher createdBy, Room room,
			int currentViewers) {
		super(courseCode, startDate, endDate, participants, createdBy, room);
		this.setCurrentViewers(currentViewers);
	}

	public int getCurrentViewers() {
		return currentViewers;
	}

	public void setCurrentViewers(int currentViewers) {
		this.currentViewers = currentViewers;
	}
}
