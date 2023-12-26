// Package declaration for the code, indicating that it belongs to the "dec14Assignment" package.
package dec14Assignment;

// Definition of the OnlineBanking class, which extends the BankOperations class.
public class OnlineBanking extends BankOperations {
	
	// Constructor for the OnlineBanking class, taking an initial deposit and initializing the balance using the parent class method.
	public OnlineBanking(double initialDeposit) {
		initialize(initialDeposit); // Initializing the balance with the provided initial deposit.
	}

	// Overridden method to authenticate credentials using only the online banking password.
	public boolean authenticateCredentials(String inputPassword, Person person) {
		// Delegating the authentication to the private method with two parameters.
		return authenticateCredentials(inputPassword, person.getOnlineBankingPassword());
	}

	// Private method to authenticate credentials, comparing the provided input with the correct online banking password.
	private boolean authenticateCredentials(String input, String correctValue) {
		// Checking if the input credentials match the correct online banking password.
		return input.equals(correctValue);
	}
}
