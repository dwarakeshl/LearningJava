// Create a Bank Operations class which has two methods withdraw, deposit view Balance.
//Create 2 Classes ATM and Online Banking, both of these classes extend Bank Operations
//Create a class which takes care of Persons account details.
//Person class should have details such as bank account no., name of account holder, total funds available, pin and online Banking Password.
//Create a Main class which takes input from user and perform required operation on the type of banking service the user wants, ATM and Online Banking.
//User should be allowed to perform only single operation (deposit cash,withdraw cash etc) 
//For every transaction, user must have to enter pin or banking password and that pin must be validated before allowing the transaction. 
//Action that user intends to do (Like deposit cash or withdraw) must be asked after validating the pin. Initial user deposit can be kept as constant value.
//User should be given Information after every transaction on the amount of balance left in account.

package dec14Assignment;

//BankOperations class represents common banking operations
public class BankOperations {
	// Protected variable to store the account balance
	protected double balance;

	// Method to initialize the account with an initial deposit
	public void initialize(double initialDeposit) {
		this.balance = initialDeposit;
	}

	// Method to deposit money into the account
	public void deposit(double amount) {
		balance += amount;
	}

	// Method to withdraw money from the account, checking for sufficient funds
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient funds!");
		}
	}

	// Method to view the current balance
	public double viewBalance() {
		return balance;
	}

	// Method to print the current balance
	public void checkBalance() {
		System.out.println("Balance: " + viewBalance());
	}

	// Method to authenticate credentials (PIN or Online Banking Password)
	public boolean authenticateCredentials(String inputCredentials, Person person) {
		return inputCredentials.equals(person.getPin()) || inputCredentials.equals(person.getOnlineBankingPassword());
	}
}