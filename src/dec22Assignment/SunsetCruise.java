package dec22Assignment;

//Child class representing SunsetCruise details
public class SunsetCruise extends CruiseShip {
	public SunsetCruise() {
		// Constructor setting specific details for SunsetCruise
		super("Sunset Cruise", 52.99, 15.99, 1);
	}

	// Override method to display cruise details
	@Override
	public void displayCruiseDetails() {
		// Call the parent class method to display basic details
		super.displayCruiseDetails();
	}
}