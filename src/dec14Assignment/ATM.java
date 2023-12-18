package dec14Assignment;

public class ATM extends BankOperations {
	public ATM(double initialDeposit) {
		initialize(initialDeposit);
	}

	public boolean authenticateCredentials(String inputPin, Person person) {
		return authenticateCredentials(inputPin, person.getPin());
	}

	private boolean authenticateCredentials(String input, String correctValue) {
		return input.equals(correctValue);
	}
}