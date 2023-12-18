
package dec14Assignment;

import java.util.Scanner;

//Main class contains the entry point of the program
public class Main {
	public static void main(String[] args) {
		// Initialize Scanner for user input
		Scanner scanner = new Scanner(System.in);
		boolean exitProgram = false;
		boolean isFirstTransaction = true;

		// Create a sample Person object with account details
		Person person = new Person("123456", "Dwarakesh", "1234", "password123");
		BankOperations bank = null;

		// Main loop for banking operations
		while (!exitProgram) {
			System.out.println("Choose banking service: 1. ATM  2. Online Banking");
			int select = scanner.nextInt();

			// Based on user choice, create an instance of ATM or OnlineBanking
			if (select == 1) {
				bank = new ATM(1000.0);
				authenticateAndProceed(scanner, bank, person, "Enter PIN:", isFirstTransaction);
			} else if (select == 2) {
				bank = new OnlineBanking(1000.0);
				authenticateAndProceed(scanner, bank, person, "Enter Online Banking Password:", isFirstTransaction);
			} else {
				System.out.println("Invalid choice.");
				break;
			}

			// Display a welcome message with the account holder's name and balance
			System.out.println("Welcome, " + person.getAccountHolderName() + "! " + "The Balance in your account is "
					+ bank.viewBalance());

			boolean continueTransaction = true;

			// Inner loop for transaction operations
			while (continueTransaction) {
				System.out.println("Choose operation: 1. Deposit  2. Withdraw  3. View Balance  4. Exit");
				int operation = scanner.nextInt();

				// Switch statement to perform different operations based on user input
				switch (operation) {
				case 1:
					System.out.println("Enter deposit amount:");
					double depositAmount = scanner.nextDouble();
					bank.deposit(depositAmount);
					break;
				case 2:
					System.out.println("Enter withdrawal amount:");
					double withdrawalAmount = scanner.nextDouble();
					bank.withdraw(withdrawalAmount);
					break;
				case 3:
					bank.checkBalance();
					break;
				case 4:
					exitProgram = true;
					continueTransaction = false;
					System.out.println("Exiting. Thank you!");
					break;
				default:
					System.out.println("Invalid operation.");
					break;
				}

				// Display the current balance after each operation
				System.out.println("Current Balance: " + bank.viewBalance());

				// Check if the user wants to perform another transaction
				if (!exitProgram) {
					System.out.println("Do you want to perform another transaction? (y/n)");
					char choice = scanner.next().charAt(0);

					if (choice != 'y') {
						continueTransaction = false;
						System.out.println("Exiting. Thank you!");
					} else {
						isFirstTransaction = false;
						// Authenticate again for subsequent transactions
						authenticateAndProceed(scanner, bank, person, "Enter credentials again:", isFirstTransaction);
					}
				}
			}
		}
	}

	// Method to limit the number of attempts
	private static void authenticateAndProceed(Scanner scanner, BankOperations bank, Person person, String prompt,
			boolean isFirstTransaction) {
		int attempts = 0;
		while (attempts < 3) {
			System.out.println(prompt);
			String inputCredentials = scanner.next();
			if (bank.authenticateCredentials(inputCredentials, person)) {
				return;
			}
			System.out.println("Invalid credentials. " + (2 - attempts) + " attempts remaining.");
			attempts++;
		}
		System.out.println("Too many unsuccessful attempts. Exiting.");
		// Closing the scanner
		scanner.close();
	}
}