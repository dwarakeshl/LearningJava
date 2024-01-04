package dec22Assignment;

import java.util.Scanner;

//Main class for the cruise booking system
public class CruiseBookingSystem {
	public static void main(String[] args) {
		// Create a scanner object to take user input
		Scanner scanner = new Scanner(System.in);
		// Display available cruise options
		System.out.println(
				"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.");
		System.out.println("1. Scenic Cruise\n2. Sunset Cruise\n3. Discovery Cruise\n4. Mystery Cruise");
		// Prompt user to enter their choice
		System.out.print("Enter your choice (1-4): ");
		int choice = scanner.nextInt();
		// Create an instance of the selected cruise type based on user input using
		// selectedCruise object
		CruiseShip selectedCruise = new CruiseShip(null, choice, choice, choice);
		switch (choice) {
		case 1:
			selectedCruise = new ScenicCruise();
			break;
		case 2:
			selectedCruise = new SunsetCruise();
			break;
		case 3:
			selectedCruise = new DiscoveryCruise();
			break;
		case 4:
			selectedCruise = new MysteryCruise();
			break;
		default:
			System.out.println("Invalid choice. Exiting...");
			System.exit(0);
		}
		// Display details of the selected cruise
		selectedCruise.displayCruiseDetails();

		// Prompt user for the number of guests and meal inclusion
		System.out.print("\nEnter the number of adults: ");
		int numAdults = scanner.nextInt();

		System.out.print("Enter the number of kids aged between 6 to 12: ");
		int numKids = scanner.nextInt();

		System.out.print("Enter the number of children aged between 0 to 5: ");
		int numChildren = scanner.nextInt();

		System.out.print("Do you want to pre-book for dinner buffet meals? (Yes/No): ");
		boolean includeMeals = scanner.next().equalsIgnoreCase("Yes");

		// Calculate and display the total, tax, and final price of the selected cruise
		// package
		double totalPrice = selectedCruise.calculatePrice(numAdults, numChildren, includeMeals);
		double hst = totalPrice * 0.15;
		double finalPrice = totalPrice + hst;

		// Display the detailed breakdown of the package and prices
		System.out.println("\nYour Package includes:");
		System.out.println(selectedCruise.getCruiseName());
		System.out.println("Adults: " + numAdults + " x $" + selectedCruise.getAdultPrice() + " = $"
				+ (numAdults * selectedCruise.getAdultPrice() * selectedCruise.getNumDays()));
		System.out.println("Children aged between 0 to 5: " + numChildren + " x $" + selectedCruise.getChildPrice()
				+ " = $" + (numChildren * selectedCruise.getChildPrice() * selectedCruise.getNumDays()));
		System.out.println("Buffet Special Price Adults: " + numAdults + " x $20.99 = $"
				+ (numAdults * 20.99 * selectedCruise.getNumDays()));
		System.out.println("Buffet Special Price Kids between 6 to 12: " + numKids + " x $4.99 = $"
				+ (numKids * 4.99 * selectedCruise.getNumDays()));
		System.out.println("Buffet Special Price children between 0 to 5: " + numChildren + " x $0.00 = $0.00");
		System.out.println("Total Price: $" + totalPrice);
		System.out.println("HST (15%): $" + hst);
		System.out.println("Final Price: $" + finalPrice);

		// Closing the scanner class
		scanner.close();
	}
}