package passwordCheck;

import java.util.Scanner;

public class PasswordCheck {

	String correctUsername = "pivotAdmin";
	String correctPassword = "Admin123";
	String username;
	String password;
	int attempts = 0;
	int maximumAttempts = 3;
	boolean checkCredentials;
	Scanner scanner = new Scanner(System.in);

	public void check() {
		while (attempts < maximumAttempts) {
			System.out.print("Enter username: ");
			username = scanner.nextLine();
			System.out.print("Enter password: ");
			password = scanner.nextLine();
			if (checkCredentials = username.equals(correctUsername) && password.equals(correctPassword)) {
				System.out.println("You are logged in to the application.");
			} else {
				System.out.println("Incorrect username or password. Try again.");
				attempts++;
			}
			if (attempts == maximumAttempts) {
				System.out.println("Account locked. Too many incorrect attempts.");
			}

		}

		scanner.close();
	}

}
