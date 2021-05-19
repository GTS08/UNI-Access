public class Computer {

	private int id;
	private boolean status;
	private Student loggedStudent;
	private Student bookedBy;

	public Student getLoggedStudent() {
		return loggedStudent;
	}

	public void setLoggedStudent(Student loggedStudent) {
		this.loggedStudent = loggedStudent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Student getBookedBy() {
		return bookedBy;
	}

	public void setBookedBy(Student bookedBy) {
		this.bookedBy = bookedBy;
	}
//method that displays the current state of a PC in the Computer Center	
 public void displayPCStatus(boolean status,int id){
   if (status == true){
     System.out.println("The Computer with the id: " + id + " is available");
   }else{
     System.out.println("The Computer with the id: " + id + " is not available");
   }
 }
//method that impliments the process of booking a PC
 public void bookPC(boolean status){
   if(status == false){
    status = true;
    System.out.println("The Computer is now booked");
   }else{
     System.out.println("The Computer cannot be booked right now");
   }
   
}
 public static void main(String[] args) {
		 Computer bookingProcess = new Computer();
		 bookingProcess.displayPCStatus(false,23);
         bookingProcess.bookPC(false);
	    }
}