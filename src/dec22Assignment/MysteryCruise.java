package dec22Assignment;

//Child class representing MysteryCruise details
public class MysteryCruise extends CruiseShip {
	public MysteryCruise() {
		// Constructor setting specific details for MysteryCruise
		super("Mystery Cruise", 45.99, 12.99, 2);
	}

	// Override method to display cruise details
	@Override
	public void displayCruiseDetails() {
		// Call the parent class method to display basic details
		super.displayCruiseDetails();
	}
}