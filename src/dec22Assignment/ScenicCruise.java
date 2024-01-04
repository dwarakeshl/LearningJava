package dec22Assignment;

//Child class representing ScenicCruise details
public class ScenicCruise extends CruiseShip {
	public ScenicCruise() {
		// Constructor setting specific details for ScenicCruise
		super("Scenic Cruise", 43.99, 12.99, 3);
	}

	// Override method to display cruise details
	@Override
	public void displayCruiseDetails() {
		// Call the parent class method to display basic details
		super.displayCruiseDetails(); 
	}
}