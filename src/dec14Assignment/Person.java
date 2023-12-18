
package dec14Assignment;

//Person class represents a bank account holder
public class Person {
	// Fields to store account details
	private String accountNo;
	private String accountHolderName;
	private String pin;
	private String onlineBankingPassword;

	// Constructor to initialize a Person with account details
	public Person(String accountNo, String accountHolderName, String pin, String onlineBankingPassword) {
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.pin = pin;
		this.onlineBankingPassword = onlineBankingPassword;
	}

	// Getter methods for retrieving account details
	public String getAccountNo() {
		return accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getPin() {
		return pin;
	}

	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}
}
