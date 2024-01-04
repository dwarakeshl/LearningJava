package dec28Assignment;

import java.util.Scanner;

public class CruiseShip {
	private String cruiseName;
	private double priceAdult;
	private double priceChild;
	private int numDays;

	// Constructor to initialize CruiseShip object with given parameters
	CruiseShip(String cruiseName, double priceAdult, double priceChild, int numDays) {
		this.cruiseName = cruiseName;
		this.priceAdult = priceAdult;
		this.priceChild = priceChild;
		this.numDays = numDays;
	}

	// Calculate the total price based on the number of adults, children, meals, and
	// child ages
	double calculatePrice(int numAdults, int numChildren, boolean includeMeals, int[] childAges) {
		double basePrice = 0;
		double mealsPrice = 0;

		// Calculate base price for adults
		for (int i = 0; i < numAdults; i++) {
			basePrice += priceAdult * numDays;
		}

		// Calculate base price for children based on age
		for (int i = 0; i < numChildren; i++) {
			if (childAges[i] <= 5) {
				// Children aged 5 and below are free
				basePrice += 0.0;
			} else {
				// Children aged above 5 are charged at the child rate
				basePrice += priceChild * numDays;
			}
		}

		// Calculate meals price if included
		if (includeMeals) {
			mealsPrice = (numAdults * 20.99 + numChildren * 4.99) * numDays;
		}

		// Return total price
		return basePrice + mealsPrice;
	}

	// Calculate the Harmonized Sales Tax (HST) for the given total price
	double calculateHST(double totalPrice) {
		return totalPrice * 0.15;
	}

	// Display an itemized bill including cruise details, individual prices, and
	// final price
	void displayItemizedBill(int numAdults, int numChildren, boolean includeMeals, int[] childAges) {
		double totalPrice = calculatePrice(numAdults, numChildren, includeMeals, childAges);
		double hst = calculateHST(totalPrice);
		double finalPrice = totalPrice + hst;

		// Display cruise details
		System.out.println("\nYour Package includes: ");
		System.out.println(cruiseName + " Adults @" + numAdults + ": $" + priceAdult * numAdults * numDays);

		// Display individual prices for children based on age
		for (int i = 0; i < numChildren; i++) {
			if (childAges[i] <= 5) {
				System.out.println(cruiseName + " Children aged 5 and below: $0.00");
			} else {
				System.out.println(cruiseName + " Children above 5 @" + (i + 1) + ": $" + priceChild * numDays);
			}
		}

		// Display meals prices if included
		if (includeMeals) {
			System.out.println("Buffet Special Price Adults @" + numAdults + ": $" + 20.99 * numAdults * numDays);

			for (int i = 0; i < numChildren; i++) {
				if (childAges[i] <= 5) {
					System.out.println("Buffet Special Price Children aged 5 and below: $0.00");
				} else {
					System.out.println("Buffet Special Price Children above 5 @" + (i + 1) + ": $" + 4.99 * numDays);
				}
			}
		}

		// Display total price, HST, and final price
		System.out.println("Total Price\t\t\t: $" + totalPrice);
		System.out.println("HST @ 15%\t\t\t: $" + hst);
		System.out.println("Final Price\t\t\t: $" + finalPrice);
	}

	// Get the number of passengers of a specific type (adults or children) from the
	// user
	static int getNumberOfPassengers(Scanner scanner, String passengerType) {
		System.out.print("Enter the number of " + passengerType + ": ");
		return scanner.nextInt();
	}

	// Ask the user whether they want to include meals and return the response
	static boolean askForMeals(Scanner scanner) {
		System.out.print(
				"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at\n"
						+ "$20.99 per day for adults\n"+ "$4.99 per day for kids aged above 5\n"+"$0.00 for kids aged 5 and below\n"
						+ "Enter 'Yes' to include meals or 'No' otherwise: ");
		String response = scanner.next();
		return response.equalsIgnoreCase("Yes");
	}

	// Display basic cruise information
	void displayCruiseInfo() {
		System.out.println(
				"The cruise that you have selected is " + cruiseName + " which is a " + numDays + "-day cruise");
		System.out.println("\nPrice for Adults (greater than 12): $" + priceAdult + " per day");
		System.out.println("Price for kids above 5: $" + priceChild + " per day");
	}
}