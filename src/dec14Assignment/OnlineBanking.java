
package dec14Assignment;

//OnlineBanking class extends BankOperations and specializes in online banking operations
public class OnlineBanking extends BankOperations {
	// Constructor to initialize an OnlineBanking instance with a given initial
	// deposit
	public OnlineBanking(double initialDeposit) {
		initialize(initialDeposit);
	}

	// Override authentication method to specifically check Online Banking Password
	public boolean authenticateCredentials(String inputPassword, Person person) {
		return authenticateCredentials(inputPassword, person.getOnlineBankingPassword());
	}

	// Private helper method for authentication
	private boolean authenticateCredentials(String input, String correctValue) {
		return input.equals(correctValue);
	}
}
