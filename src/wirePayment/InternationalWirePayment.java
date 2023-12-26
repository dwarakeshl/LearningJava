package wirePayment;

public class InternationalWirePayment extends WirePayment {
	@Override
	public void initiatePayment() {
		System.out.println("Initiating international wire payment.");
	}

	void processForeignExchange() {
		System.out.println("Processing international wire payment with foreign exchange.");
	}

}
