package dec7Assignment;

import java.util.Scanner;

// Pizza Template class
public class PizzaTemplate {
	// Array to store pizza prices
	int[] pizzaPrices = { 15, 20, 25 };
	int[] additionalPrices = { 2, 3, 1 };

	 // Constructor with arguments
    public PizzaTemplate(int[] pizzaPrices, int[] additionalPrices) {
        this.pizzaPrices = pizzaPrices;
        this.additionalPrices = additionalPrices;
    }
	// Method to calculate the final bill
	void calculateBill(String size, boolean hasPepperoni, boolean hasExtraCheese) {
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
				basePrice += additionalPrices[0];
			} else {
				basePrice += additionalPrices[1];
			}
		}
		// If the pizza has extra cheese, add the additional price to the base price
		if (hasExtraCheese) {
			basePrice += additionalPrices[2];
		}

		// Display the final bill to the user
		System.out.println("Your final bill is $" + basePrice);
	}

	// Method to get pizza order details from the user
	void getOrderFromUser(String size, boolean hasPepperoni, boolean hasExtraCheese) {
		Scanner scanner = new Scanner(System.in);

		// Loop to get a valid pizza size from the user
		while (true) {
			System.out.println("Pizza Menu \nSmall Pizza: $" + pizzaPrices[0] + "\nMedium Pizza:$" + pizzaPrices[1]
					+ "\nLarge Pizza: $" + pizzaPrices[0]);
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
		calculateBill(size, hasPepperoni, hasExtraCheese);
		scanner.close();
	}
}



