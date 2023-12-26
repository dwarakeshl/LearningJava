// Package declaration for the code, indicating that it belongs to the "dec14Assignment" package.
package dec14Assignment;

// Definition of the BankOperations class.
public class BankOperations {
	
	// Variable to store the balance, declared as protected to allow access to subclasses.
	protected double balance;

	// Method to initialize the balance with an initial deposit.
	public void initialize(double initialDeposit) {
		this.balance = initialDeposit; // Assigning the initial deposit to the balance.
	}

	// Method to deposit a specified amount into the account.
	public void deposit(double amount) {
		balance += amount; // Adding the deposited amount to the current balance.
	}

	// Method to withdraw a specified amount from the account, checking for sufficient funds.
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount; // Subtracting the withdrawal amount from the balance if sufficient funds are available.
		} else {
			System.out.println("Insufficient funds!"); // Displaying a message if the withdrawal amount exceeds the available balance.
		}
	}

	// Method to return the current balance.
	public double viewBalance() {
		return balance; // Returning the current balance.
	}

	// Method to display the current balance.
	public void checkBalance() {
		System.out.println("Balance: " + viewBalance()); // Printing the current balance to the console.
	}

	// Method to authenticate credentials based on PIN or online banking password.
	public boolean authenticateCredentials(String inputCredentials, Person person) {
		// Checking if the input credentials match either the PIN or online banking password of the specified person.
		return inputCredentials.equals(person.getPin()) || inputCredentials.equals(person.getOnlineBankingPassword());
	}
}
