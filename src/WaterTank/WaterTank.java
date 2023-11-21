package waterTank;

//Template Class
public class WaterTank {
	// constants for keeping tank and bucket capacities
	int maxCapacity;
	int bucketCapacity;
	int cutOff;
	// variable for keeping current water level in the tank
	int currentLevel;

	// method to fill the tank
	public void fillTank() {
		for (currentLevel = 0; currentLevel <= cutOff; currentLevel+= bucketCapacity) {
			System.out.println("Filled the tank with " + bucketCapacity + " litres. Current water level: "
					+ currentLevel + " litres");
			// to check and stop the tank from overflowing
			if (currentLevel == cutOff) {
				System.out.println("Tank will overflow. Stop filling");
				break;
			}
	}
	}
}