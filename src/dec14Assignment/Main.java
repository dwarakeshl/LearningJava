package dec14Assignment;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Creating a Scanner object to handle user input.
		Scanner scanner = new Scanner(System.in);
		
		// Flag to control program exit.
		boolean exitProgram = false;
		
		// Flag to track if it's the first transaction for authentication purposes.
		boolean isFirstTransaction = true;
		
		// Creating a Person object with sample details.
		Person person = new Person("123456", "Dwarakesh", "1234", "password123");
		
		// Declaring a BankOperations reference without instantiation.
		BankOperations bank = null;

		// Main program loop.
		while (!exitProgram) {
			System.out.println("Choose banking service: 1. ATM  2. Online Banking");
			int select = scanner.nextInt();

			if (select == 1) {
				// Creating an ATM instance with an initial deposit of 1000.0.
				bank = new ATM(1000.0);
				// Authenticating and proceeding with the transaction.
				authenticateAndProceed(scanner, bank, person, "Enter PIN:", isFirstTransaction);
			} else if (select == 2) {
				// Creating an OnlineBanking instance with an initial deposit of 1000.0.
				bank = new OnlineBanking(1000.0);
				// Authenticating and proceeding with the transaction.
				authenticateAndProceed(scanner, bank, person, "Enter Online Banking Password:", isFirstTransaction);
			} else {
				System.out.println("Invalid choice.");
				break;
			}

			// Displaying a welcome message and the current account balance.
			System.out.println("Welcome, " + person.getAccountHolderName() + "! " +
					"The Balance in your account is " + bank.viewBalance());

			// Loop for transaction operations.
			boolean continueTransaction = true;

			while (continueTransaction) {
				System.out.println("Choose operation: 1. Deposit  2. Withdraw  3. View Balance  4. Exit");
				int operation = scanner.nextInt();

				switch (operation) {
				case 1:
					System.out.println("Enter deposit amount:");
					double depositAmount = scanner.nextDouble();
					// Performing a deposit operation.
					bank.deposit(depositAmount);
					break;
				case 2:
					System.out.println("Enter withdrawal amount:");
					double withdrawalAmount = scanner.nextDouble();
					// Performing a withdrawal operation.
					bank.withdraw(withdrawalAmount);
					break;
				case 3:
					// Displaying the current account balance.
					bank.checkBalance();
					break;
				case 4:
					// Exiting the program and ending the transaction loop.
					exitProgram = true;
					continueTransaction = false;
					System.out.println("Exiting. Thank you!");
					break;
				default:
					System.out.println("Invalid operation.");
					break;
				}

				// Displaying the current account balance after each transaction.
				System.out.println("Current Balance: " + bank.viewBalance());

				if (!exitProgram) {
					System.out.println("Do you want to perform another transaction? (y/n)");
					char choice = scanner.next().charAt(0);

					if (choice != 'y') {
						// Exiting the program and ending the transaction loop.
						continueTransaction = false;
						System.out.println("Exiting. Thank you!");
					} else {
						// Updating the flag for subsequent transactions.
						isFirstTransaction = false;
						// Authenticating and proceeding with the transaction again.
						authenticateAndProceed(scanner, bank, person, "Enter credentials again:", isFirstTransaction);
					}
				}
			}
		}
		
		// Closing the scanner to prevent resource leakage.
		scanner.close();
	}

	// Method for authenticating credentials and proceeding with the transaction.
	private static void authenticateAndProceed(Scanner scanner, BankOperations bank, Person person, String prompt,
			boolean isFirstTransaction) {
		int attempts = 0;
		// Loop for authentication attempts, limited to three.
		while (attempts < 3) {
			System.out.println(prompt);
			String inputCredentials = scanner.next();
			// Checking if the provided credentials are valid.
			if (bank.authenticateCredentials(inputCredentials, person)) {
				return; // Returning from the method if authentication is successful.
			}
			System.out.println("Invalid credentials. " + (2 - attempts) + " attempts remaining.");
			attempts++;
		}
		// Displaying a message for too many unsuccessful attempts and exiting the program.
		System.out.println("Too many unsuccessful attempts. Exiting.");
		// Closing the scanner to prevent resource leakage.
		scanner.close();
		System.exit(0); // Exiting the program if all three attempts are unsuccessful.
	}
}
