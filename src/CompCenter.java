public class CompCenter {
	private String status;
	private int occupied;
	private int available;
	private String[] openHours;
	private int totalSeats;

	public CompCenter(String status, int occupied, int available, String[] openHours, int totalSeats) {
		this.setStatus(status);
		this.setOccupied(occupied);
		this.setAvailable(available);
		this.setOpenHours(openHours);
		this.setTotalSeats(totalSeats);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getOccupied() {
		return occupied;
	}

	public void setOccupied(int occupied) {
		this.occupied = occupied;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = totalSeats - occupied;
	}

	public String[] getOpenHours() {
		return openHours;
	}

	public void setOpenHours(String[] openHours) {
		this.openHours = openHours;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

}
