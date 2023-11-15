package AmusementParkRide;

public class RideHeight {
	int height;

	// Check if height is within the allowed range
	public void checkHeight() {

		if (height >= 90 && height <= 200) {
			System.out.println("You are allowed to ride!");
		} else {
			System.out.println("Sorry, you are not allowed to ride.");
		}
	}

}