package wirePayment;

public class WirePaymentMain {

	public static void main(String[] args) {
		WirePayment genericWirePayment = new WirePayment();
		genericWirePayment.initiatePayment();

		DomesticWirePayment domesticWirePayment = new DomesticWirePayment();
		domesticWirePayment.initiatePayment();
		domesticWirePayment.processSameCurrency();

		InternationalWirePayment internationalWirePayment = new InternationalWirePayment();
		internationalWirePayment.initiatePayment();
		internationalWirePayment.processForeignExchange();
	}
}
