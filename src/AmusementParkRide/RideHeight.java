package AmusementParkRide;

//Template class
public class RideHeight {
	int height;

	// Check if height is within the allowed range
	// Data tested with integer values 89, 90, 172 200 and 201

	public void checkHeight() {
		if (height >= 90 && height <= 200) {
			System.out.println("You are allowed to ride!");
		} else {
			System.out.println("Sorry, you are not allowed to ride.");
		}
	}

}