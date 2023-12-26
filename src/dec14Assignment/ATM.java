// Package declaration for the code, indicating that it belongs to the "dec14Assignment" package.
package dec14Assignment;

// Definition of the ATM class, which extends the BankOperations class.
public class ATM extends BankOperations {
	
	// Constructor for the ATM class, taking an initial deposit and initializing the balance using the parent class method.
	public ATM(double initialDeposit) {
		initialize(initialDeposit); // Initializing the balance with the provided initial deposit.
	}

	// Overridden method to authenticate credentials using only the PIN.
	public boolean authenticateCredentials(String inputPin, Person person) {
		// Delegating the authentication to the private method with two parameters.
		return authenticateCredentials(inputPin, person.getPin());
	}

	// Private method to authenticate credentials, comparing the provided input with the correct PIN.
	private boolean authenticateCredentials(String input, String correctValue) {
		// Checking if the input credentials match the correct PIN.
		return input.equals(correctValue);
	}
}
