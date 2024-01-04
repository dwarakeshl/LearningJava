package dec28Assignment;

public class ScenicCruise extends CruiseShip {
	// Constructor to initialize ScenicCruise with specific details
	ScenicCruise() {
		super("Scenic Cruise", 43.99, 12.99, 3);
	}

	// Override the displayItemizedBill method to include specific details for
	// ScenicCruise
	@Override
	void displayItemizedBill(int numAdults, int numChildren, boolean includeMeals, int[] childAges) {
		// Display basic cruise information
		displayCruiseInfo();
		System.out.println("You have selected the Scenic Cruise:");
		// Call the superclass method to display the itemized bill
		super.displayItemizedBill(numAdults, numChildren, includeMeals, childAges);
	}
}
