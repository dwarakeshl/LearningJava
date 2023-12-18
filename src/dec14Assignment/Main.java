package dec14Assignment;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean exitProgram = false;
		boolean isFirstTransaction = true;
		Person person = new Person("123456", "Dwarakesh", "1234", "password123");
		BankOperations bank = null;

		while (!exitProgram) {
			System.out.println("Choose banking service: 1. ATM  2. Online Banking");
			int select = scanner.nextInt();

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

			System.out.println("Welcome, " + person.getAccountHolderName() + "! " + "The Balance in your account is "
					+ bank.viewBalance());

			boolean continueTransaction = true;

			while (continueTransaction) {
				System.out.println("Choose operation: 1. Deposit  2. Withdraw  3. View Balance  4. Exit");
				int operation = scanner.nextInt();

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

				System.out.println("Current Balance: " + bank.viewBalance());

				if (!exitProgram) {
					System.out.println("Do you want to perform another transaction? (y/n)");
					char choice = scanner.next().charAt(0);

					if (choice != 'y') {
						continueTransaction = false;
						System.out.println("Exiting. Thank you!");
					} else {
						isFirstTransaction = false;
						authenticateAndProceed(scanner, bank, person, "Enter credentials again:", isFirstTransaction);
					}
				}
			}
		}
	}

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
		scanner.close();
		System.exit(0);
	}
}
