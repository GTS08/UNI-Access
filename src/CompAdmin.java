import java.util.concurrent.TimeUnit;

public class CompAdmin extends User {

	public CompAdmin(String firstName, String lastName, String username, String password, Department dep) {
		super(firstName, lastName, username, password, dep);
	}

	public boolean isValidStatus(status status, CompCenter center) {
		if (status == center.getStatus()) {
			System.out.println("This is the current status!");
			return false;
		}
		return true;
	}

	public void updateStatus(status status, Scanner scanner, CompCenter center) {
		if (status == status.OFFLINE) {
			java.util.Scanner sc = new java.util.Scanner(System.in);

			System.out.println("Enter reason:");
			String reasons = sc.nextLine();
			System.out.println("Reason: " + reasons);

			System.out.println("Enter when (in seconds):");
			int when = sc.nextInt();
			System.out.println("Center going OFFLINE in: " + when + " seconds.");

			try {
				TimeUnit.SECONDS.sleep(when);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Center is now OFFLINE.");
			center.setStatus(status.OFFLINE);
			scanner.setMode(mode.FORBIDDEN);
		} else if (status == status.ONLINE) {
			System.out.println("Center is now ONLINE.");
			center.setStatus(status.ONLINE);
			scanner.setMode(mode.NORMAL);
		}
	}
}
