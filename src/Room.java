import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Room {

	private int capacity;
	private boolean isLab;
	private Department dep;
	private String title;

	public Room(int capacity, boolean isLab, Department dep, String title) {
		this.setCapacity(capacity);
		this.setIsLab(isLab);
		this.setDep(dep);
		this.setTitle(title);
	}

	public int getCapacity() {
		return capacity;
	}

	public boolean getIsLab() {
		return isLab;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setIsLab(boolean isLab) {
		this.isLab = isLab;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getTeacherRooms(Teacher teacher, String dayOfTheWeek, Event[] events) {

		List<String> teacherRoomsList = new ArrayList<>();
		String teacherRoom;
		if (dayOfTheWeek == "MONDAY") {
			for (int i = 0; i < events.length; i++) {
				if (events[i].getCreatedBy() == teacher
						&& events[i].getStartDate().getDayOfWeek().toString() == dayOfTheWeek) {

					teacherRoom = events[i].getRoom().title + events[i].hoursOccupiedMonday;
					if (events[i].hoursOccupiedMonday.isEmpty()) {
						continue;
					} else
						teacherRoomsList.add(teacherRoom);
				}
			}
		} else if (dayOfTheWeek == "TUESDAY") {
			for (int i = 0; i < events.length; i++) {
				if (events[i].getCreatedBy() == teacher
						&& events[i].getStartDate().getDayOfWeek().toString() == dayOfTheWeek) {

					teacherRoom = events[i].getRoom().title + events[i].hoursOccupiedTuesday;
					if (events[i].hoursOccupiedTuesday.isEmpty()) {
						continue;
					} else
						teacherRoomsList.add(teacherRoom);
				}
			}
		} else if (dayOfTheWeek == "WEDNESDAY") {
			for (int i = 0; i < events.length; i++) {
				if (events[i].getCreatedBy() == teacher
						&& events[i].getStartDate().getDayOfWeek().toString() == dayOfTheWeek) {

					teacherRoom = events[i].getRoom().title + events[i].hoursOccupiedWednesday;
					if (events[i].hoursOccupiedWednesday.isEmpty()) {
						continue;
					} else
						teacherRoomsList.add(teacherRoom);
				}
			}
		} else if (dayOfTheWeek == "THURSDAY") {
			for (int i = 0; i < events.length; i++) {
				if (events[i].getCreatedBy() == teacher
						&& events[i].getStartDate().getDayOfWeek().toString() == dayOfTheWeek) {

					teacherRoom = events[i].getRoom().title + events[i].hoursOccupiedThursday;
					if (events[i].hoursOccupiedThursday.isEmpty()) {
						continue;
					} else
						teacherRoomsList.add(teacherRoom);
				}
			}
		} else if (dayOfTheWeek == "FRIDAY") {
			for (int i = 0; i < events.length; i++) {
				if (events[i].getCreatedBy() == teacher
						&& events[i].getStartDate().getDayOfWeek().toString() == dayOfTheWeek) {

					teacherRoom = events[i].getRoom().title + events[i].hoursOccupiedFriday;
					if (events[i].hoursOccupiedFriday.isEmpty()) {
						continue;
					} else
						teacherRoomsList.add(teacherRoom);
				}
			}
		}
		return teacherRoomsList;
	}

	public void deleteReservedRoom(Room room, LocalDateTime timeStart, LocalDateTime timeEnd, Event[] events) {

		String removedStr;
		if (timeStart.getDayOfWeek().toString() == "MONDAY") {
			removedStr = String.valueOf(timeStart.getHour()) + '-' + String.valueOf(timeEnd.getHour());
			for (int i = 0; i < events.length; i++) {
				if (room == events[i].getRoom()) {
					events[i].hoursOccupiedMonday.remove(removedStr);
					break;
				}

			}

		} else if (timeStart.getDayOfWeek().toString() == "TUESDAY") {
			removedStr = String.valueOf(timeStart.getHour()) + '-' + String.valueOf(timeEnd.getHour());
			for (int i = 0; i < events.length; i++) {
				if (room == events[i].getRoom()) {
					events[i].hoursOccupiedTuesday.remove(removedStr);
					break;
				}

			}

		} else if (timeStart.getDayOfWeek().toString() == "WEDNESDAY") {
			removedStr = String.valueOf(timeStart.getHour()) + '-' + String.valueOf(timeEnd.getHour());
			for (int i = 0; i < events.length; i++) {
				if (room == events[i].getRoom()) {
					events[i].hoursOccupiedWednesday.remove(removedStr);
					break;
				}

			}

		} else if (timeStart.getDayOfWeek().toString() == "THURSDAY") {
			removedStr = String.valueOf(timeStart.getHour()) + '-' + String.valueOf(timeEnd.getHour());
			for (int i = 0; i < events.length; i++) {
				if (room == events[i].getRoom()) {
					events[i].hoursOccupiedThursday.remove(removedStr);
					break;
				}

			}

		} else if (timeStart.getDayOfWeek().toString() == "FRIDAY") {
			removedStr = String.valueOf(timeStart.getHour()) + '-' + String.valueOf(timeEnd.getHour());
			for (int i = 0; i < events.length; i++) {
				if (room == events[i].getRoom()) {
					events[i].hoursOccupiedFriday.remove(removedStr);
					break;
				}

			}

		}

	}
}
