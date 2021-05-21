import java.time.LocalDateTime;

public class Lecture extends Event {
	private int currentViewers;

	Lecture(String courseCode, LocalDateTime startDate, LocalDateTime endDate, Student[] participants, Teacher createdBy, Room room,
			Course course, int currentViewers) {
		super(courseCode, startDate, endDate, participants, createdBy, room, course);
	}

	public int getCurrentViewers() {
		return currentViewers;
	}

	public void setCurrentViewers(int currentViewers) {
		this.currentViewers = currentViewers;
	}
}
