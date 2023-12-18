package dec14Assignment;

public class Person {
	private String accountNo;
	private String accountHolderName;
	private String pin;
	private String onlineBankingPassword;

	public Person(String accountNo, String accountHolderName, String pin, String onlineBankingPassword) {
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.pin = pin;
		this.onlineBankingPassword = onlineBankingPassword;
	}

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