package dec28Assignment;

import java.util.Scanner;

public class User {
	private String email; 
	private String password;
	private String fullName;
	private String phoneNumber;

	// Constructor to initialize User object with given parameters
	User(String email, String password, String fullName, String phoneNumber) {
		this.email = email; 
		this.password = password;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
	}

	// Display user information
	public void displayUserInfo() {
		System.out.println("User Information:");
		System.out.println("Email: " + email); 
		System.out.println("Full Name: " + fullName);
		System.out.println("Phone Number: " + phoneNumber);
	}

	// Change user password after verifying existing password
	public void changePassword(Scanner scanner) {
		System.out.print("\nEnter your existing password: ");
		String existingPassword = scanner.nextLine();

		// Check if existing password matches
		if (!existingPassword.equals(password)) {
			System.out.println("Incorrect password. Exiting...");
			System.exit(1);
		}

		// Get and set the new password
		System.out.print("Enter your new password: ");
		String newPassword = scanner.nextLine();
		setPassword(newPassword);

		System.out.println("Your password has been changed! Thank you for using the service!");
	}

	// Change user phone number
	public void changePhoneNumber(Scanner scanner) {
		System.out.print("\nEnter your new phone number: ");
		String newPhoneNumber = scanner.nextLine();
		setPhoneNumber(newPhoneNumber);

		System.out.println("Your phone number has been changed! Thank you for using the service!");
	}

	// Change user email address
	public void changeEmail(Scanner scanner) {
		System.out.print("\nEnter your new email address: ");
		String newEmail = scanner.nextLine();
		setEmail(newEmail);

		System.out.println("Your email address has been changed! Thank you for using the service!");
	}

	// Set the user password
	private void setPassword(String password) {
		this.password = password;
	}

	// Set the user phone number
	private void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// Set the user email address
	private void setEmail(String email) {
		this.email = email;
	}
}
