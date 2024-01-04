package dec22Assignment;

//Child class representing DiscoveryCruise details
public class DiscoveryCruise extends CruiseShip {
	public DiscoveryCruise() {
		// Constructor setting specific details for DiscoveryCruise
		super("Discovery Cruise", 39.99, 9.99, 4);
	}

	// Override method to display cruise details
	@Override
	public void displayCruiseDetails() {
		// Call the parent class method to display basic details
		super.displayCruiseDetails();
	}
}