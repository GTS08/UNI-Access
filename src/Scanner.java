import java.util.Random;

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
}
