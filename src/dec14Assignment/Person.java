// Package declaration for the code, indicating that it belongs to the "dec14Assignment" package.
package dec14Assignment;

// Definition of the Person class, representing an individual with banking-related information.
public class Person {
	
	// Private member variables to store account details.
	private String accountNo;
	private String accountHolderName;
	private String pin;
	private String onlineBankingPassword;

	// Constructor for the Person class, initializing the member variables with provided values.
	public Person(String accountNo, String accountHolderName, String pin, String onlineBankingPassword) {
		this.accountNo = accountNo; // Assigning the provided account number.
		this.accountHolderName = accountHolderName; // Assigning the provided account holder name.
		this.pin = pin; // Assigning the provided PIN.
		this.onlineBankingPassword = onlineBankingPassword; // Assigning the provided online banking password.
	}

	// Getter method to retrieve the account number.
	public String getAccountNo() {
		return accountNo; // Returning the account number.
	}

	// Getter method to retrieve the account holder name.
	public String getAccountHolderName() {
		return accountHolderName; // Returning the account holder name.
	}

	// Getter method to retrieve the PIN.
	public String getPin() {
		return pin; // Returning the PIN.
	}

	// Getter method to retrieve the online banking password.
	public String getOnlineBankingPassword() {
		return onlineBankingPassword; // Returning the online banking password.
	}
}
