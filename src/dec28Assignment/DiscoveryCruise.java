package dec28Assignment;

public class DiscoveryCruise extends CruiseShip {
	// Constructor to initialize DiscoveryCruise with specific details
	DiscoveryCruise() {
		super("Discovery Cruise", 39.99, 9.99, 4);
	}

	// Override the displayItemizedBill method to include specific details for
	// DiscoveryCruise
	@Override
	void displayItemizedBill(int numAdults, int numChildren, boolean includeMeals, int[] childAges) {
		// Display basic cruise information
		displayCruiseInfo();
		System.out.println("You have selected the Discovery Cruise:");
		// Call the superclass method to display the itemized bill
		super.displayItemizedBill(numAdults, numChildren, includeMeals, childAges);
	}
}
