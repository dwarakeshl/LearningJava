package WaterTank;

//Template Class
public class WaterTank {
	// constants for keeping tank and bucket capacities
	int maxCapacity = 100;
	int bucketCapacity = 10;
	// variable for keeping current water level in the tank
	int currentLevel = 0;

	// method to fill the tank
	public void fillTank() {
		for (int i = 0; i < maxCapacity / bucketCapacity; i++) {
			// to check and stop the tank from overflowing
			if (currentLevel + bucketCapacity > maxCapacity) {
				break;
			}
			// fill the tank with the bucket capacity
			currentLevel += bucketCapacity;
			System.out.println("Filled the tank with " + bucketCapacity + " litres. Current water level: "
					+ currentLevel + " litres");
		}
	}
}