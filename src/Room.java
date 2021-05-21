public class Room {
	
	private int capacity;
	private boolean isLab;
	private Department dep;
	private String title;
	
	public Room(int capacity, boolean isLab) {
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
}
