public class Room {
	
	private int capacity;
	private boolean isLab;
	
	public Room(int capacity, boolean isLab) {
		this.setCapacity(capacity);
		this.setIsLab(isLab);
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
}
