import java.util.Random;
import java.time.LocalDateTime;

public class Scanner {
	private String scannerCode;
	private String mode;
	private Room room;
	
	public Scanner() {}

	public Scanner(String scannerCode, String mode, Room room) {
		this.setScannerCode(scannerCode);
		this.setMode(mode);
		this.setRoom(room);
	}

	public String getScannerCode() {
		return scannerCode;
	}

	public void setScannerCode(String scannerCode) {
		this.scannerCode = scannerCode;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public void showMessage(int message) {
		switch (message) {
		case 1:
			System.out.println("You are not registered for this exam.");
			break;
		case 2:
			System.out.println("Your exam is in another room.");
			break;
		case 3:
			System.out.println("Validation succeeded!");
			break;
		case 4:
			System.out.println("Validation failed!");
			break;
		case 5:
			System.out.println("You're expected!");
			break;
		case 6:
			System.out.println("You're not expected!");
			break;	
		case 7:
			System.out.println("You're on time!");
			break;
		case 8:
			System.out.println("You're late!");
			break;	
		case 9:
			System.out.println("You're early!");
			break;
		default:
			System.out.println("Something went wrong!");
		}
	}

	public boolean isValidStudent(Student student) {
		// Create instance of Random class
		Random rand = new Random();
		
		// Generate random integer in range 0 to 2
		int random_regNo = rand.nextInt(3);
		
		if (student.getRegNo() == random_regNo) {
			showMessage(3);
			return true;
		}
		else {
			showMessage(4);
			return false;
		}
	}
	
	public boolean isExpectedStudent(Student student, Event event) {
		Student[] participants = event.getParticipants();
		
		for (int i = 0; i < participants.length; i++) {
			if (student.getRegNo() == participants[i].getRegNo()) {
				showMessage(5);
				return true;
			}
		}
		showMessage(6);
		return false;
	}
	
	public boolean isLateStudent(Event event) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime startDate = event.getStartDate();
		long timeout = event.getTimeout();
		if (now.isAfter(startDate.minusMinutes(15)) && now.isBefore(startDate.plusMinutes(timeout))){
			showMessage(7);
			return false;
		}
		else if (now.isAfter(startDate.plusMinutes(timeout))) {
			showMessage(8);
			return true;
		}
		else {
			showMessage(9);
			return false;
		}		
	}
}
