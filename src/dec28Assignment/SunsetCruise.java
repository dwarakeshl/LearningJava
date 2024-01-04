package dec28Assignment;

public class SunsetCruise extends CruiseShip {
	// Constructor to initialize SunsetCruise with specific details
	SunsetCruise() {
		super("Sunset Cruise", 52.99, 15.99, 1);
	}

	// Override the displayItemizedBill method to include specific details for
	// SunsetCruise
	@Override
	void displayItemizedBill(int numAdults, int numChildren, boolean includeMeals, int[] childAges) {
		// Display basic cruise information
		displayCruiseInfo();
		System.out.println("You have selected the Sunset Cruise:");
		// Call the superclass method to display the itemized bill
		super.displayItemizedBill(numAdults, numChildren, includeMeals, childAges);
	}
}
