package wirePayment;

public class DomesticWirePayment extends WirePayment {
	@Override
	public void initiatePayment() {
		System.out.println("Initiating domestic wire payment.");
	}

	void processSameCurrency() {
		System.out.println("Processing domestic wire payment in the same currency.");
	}
}
