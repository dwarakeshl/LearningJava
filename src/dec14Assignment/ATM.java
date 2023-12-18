
package dec14Assignment;

//ATM class extends BankOperations and specializes in ATM operations
public class ATM extends BankOperations {
	// Constructor to initialize an ATM with a given initial deposit
	public ATM(double initialDeposit) {
		initialize(initialDeposit);
	}

	// Override authentication method to specifically check PIN credentials
	public boolean authenticateCredentials(String inputPin, Person person) {
		return authenticateCredentials(inputPin, person.getPin());
	}

	// Private helper method for authentication
	private boolean authenticateCredentials(String input, String correctValue) {
		return input.equals(correctValue);
	}
}