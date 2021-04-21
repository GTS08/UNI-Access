public class Main {

	public static void main(String[] args) {
		User George = new User("George", "Thomas", "gthomas", "gthomas1999");

		System.out.println("Username: " + George.getFirstName());
		System.out.println("Username: " + George.getLastName());
		System.out.println("Username: " + George.getUsername());
		System.out.println("Username: " + George.getPassword());

	}

}
