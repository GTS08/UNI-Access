public class Scanner {
	private String scannerCode;
	private String mode;
	private Room room;

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
			System.out.println("You exam is in another room.");
			break;
		default:
			System.out.println("Something went wrong");
		}
	}

}
