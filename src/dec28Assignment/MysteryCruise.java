package dec28Assignment;

public class MysteryCruise extends CruiseShip {
	// Constructor to initialize MysteryCruise with specific details
	MysteryCruise() {
		super("Mystery Cruise", 45.99, 12.99, 2);
	}

	// Override the displayItemizedBill method to include specific details for
	// MysteryCruise
	@Override
	void displayItemizedBill(int numAdults, int numChildren, boolean includeMeals, int[] childAges) {
		// Display basic cruise information
		displayCruiseInfo();
		System.out.println("You have selected the Mystery Cruise:");
		// Call the superclass method to display the itemized bill
		super.displayItemizedBill(numAdults, numChildren, includeMeals, childAges);
	}
}
