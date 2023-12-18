package dec14Assignment;

public class BankOperations {
	protected double balance;

	public void initialize(double initialDeposit) {
		this.balance = initialDeposit;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient funds!");
		}
	}

	public double viewBalance() {
		return balance;
	}

	public void checkBalance() {
		System.out.println("Balance: " + viewBalance());
	}

	public boolean authenticateCredentials(String inputCredentials, Person person) {
		return inputCredentials.equals(person.getPin()) || inputCredentials.equals(person.getOnlineBankingPassword());
	}
}