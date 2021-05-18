public class Scanner extends Room {
	//private attributes of Scanner class
	private String scannerCode;
	private String mode;
	private Room room;
	// constructor with super
	public Scanner(int capacity, boolean isLab, String scannerCode, String mode, Room room) {
		super(capacity, isLab);
		this.setScannerCode(scannerCode);
		this.setMode(mode);
		this.setRoom(room);
		}
	// setters and getters
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
	
}
