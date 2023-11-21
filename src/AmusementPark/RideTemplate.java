package amusementPark;

import java.util.Scanner;
//Template Class
public class RideTemplate {
	int height;
	int maxCapacity = 10;
	int minHeight = 90;
	int maxHeight = 200;
	int currentCapacity=0;

	Scanner scanner = new Scanner(System.in);
	// Loop to manage the ride
	public void checkHeight() {
		for (currentCapacity = 1; currentCapacity <= maxCapacity; currentCapacity++) {
			System.out.println("Enter the height of the person in centimeters:");
			height = scanner.nextInt();
			scanner.nextLine();
			// Check if height is within the allowed range	
		if (height >= minHeight && height <= maxHeight) {
			System.out.println("Person with height " + height + " cm added to the ride. Current capacity: " + currentCapacity + "/" + maxCapacity);
		} else {
			System.out.println("Sorry, the person with height " + height + " cm does not meet the height criteria for the ride.");
			currentCapacity--;// Decrement the loop variable to retry for the same person
		}
		 // Check if the ride is full
        if (currentCapacity == maxCapacity) {
            System.out.println("The ride is now full. Cannot allow more people.");
            break;
        }
	}
		scanner.close();
		}
	
}
	
