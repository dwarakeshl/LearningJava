package dec14Assignment;

public class OnlineBanking extends BankOperations {
	public OnlineBanking(double initialDeposit) {
		initialize(initialDeposit);
	}

	public boolean authenticateCredentials(String inputPassword, Person person) {
		return authenticateCredentials(inputPassword, person.getOnlineBankingPassword());
	}

	private boolean authenticateCredentials(String input, String correctValue) {
		return input.equals(correctValue);
	}
}