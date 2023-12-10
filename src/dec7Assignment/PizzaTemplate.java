package dec7Assignment;

import java.util.Scanner;

// Pizza Template class
public class PizzaTemplate {
	// Array to store pizza prices
	int[] pizzaPrices = { 15, 20, 25 };
	// String variable to store the pizza size
	String size;
	// Boolean variable to check if the pizza has pepperoni topping
	boolean hasPepperoni;
	// Boolean variable to check if the pizza has extra cheese
	boolean hasExtraCheese;

	// Method to calculate the final bill
	void calculateBill() {
		int basePrice = 0;
		// Switch statement to determine the base price based on the pizza size
		switch (size.toLowerCase()) {
		case "small":
			basePrice = pizzaPrices[0];
			break;
		case "medium":
			basePrice = pizzaPrices[1];
			break;
		case "large":
			basePrice = pizzaPrices[2];
			break;
		}

		// If the pizza has pepperoni, add the additional price to the base price
		if (hasPepperoni) {
			if (size.equalsIgnoreCase("small")) {
				basePrice += 2;
			} else {
				basePrice += 3;
			}
		}

		// If the pizza has extra cheese, add the additional price to the base price
		if (hasExtraCheese) {
			basePrice += 1;
		}

		// Display the final bill to the user
		System.out.println("Your final bill is $" + basePrice);
	}

	// Method to get pizza order details from the user
	void getOrderFromUser() {
		Scanner scanner = new Scanner(System.in);

		// Loop to get a valid pizza size from the user
		while (true) {
			System.out.println("Enter the pizza size (Small, Medium, Large): ");
			size = scanner.next();
			if (size.equalsIgnoreCase("Small") || size.equalsIgnoreCase("Medium") || size.equalsIgnoreCase("Large")) {
				break;
			} else {
				System.out.println("Invalid input for pizza size. Please try again.");
			}
		}

		// Loop to get user input for additional pepperoni topping
		while (true) {
			System.out.println("Do you want additional pepperoni topping? (yes/no): ");
			String input = scanner.next();
			if (input.equalsIgnoreCase("yes")) {
				hasPepperoni = true;
				break;
			} else if (input.equalsIgnoreCase("no")) {
				hasPepperoni = false;
				break;
			} else {
				System.out.println("Invalid input. Please enter 'yes' or 'no'.");
			}
		}

		// Loop to get user input for extra cheese
		while (true) {
			System.out.println("Do you want extra cheese? (yes/no): ");
			String input = scanner.next();
			if (input.equalsIgnoreCase("yes")) {
				hasExtraCheese = true;
				break;
			} else if (input.equalsIgnoreCase("no")) {
				hasExtraCheese = false;
				break;
			} else {
				System.out.println("Invalid input. Please enter 'yes' or 'no'.");
			}
		}

		scanner.close();
	}
}
