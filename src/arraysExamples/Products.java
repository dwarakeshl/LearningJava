package arraysExamples;

import java.util.Scanner;

public class Products {

	String[] products = { "Laptop", "Phone", "Powerbank", "Headphones", "Earphones", "Mouse", "Charger", "LaptopStands",
			"Keyboard", "HDMI cable" };
	Scanner sc = new Scanner(System.in);

	void findProductExists() {

		System.out.println("Enter the product you want to buy");
		String item1 = sc.next();

		System.out.println("Enter the second product you want to buy:");
		String item2 = sc.next();

		boolean item1Found = false;
		boolean item2Found = false;

		// Iterate over the array
		for (int i = 0; i < products.length; i++) {

			if (products[i].equals(item1)) {
				item1Found = true;
			} else if (products[i].equals(item2)) {
				item2Found = true;
			}

			// If both items are found, no need to continue the loop
			if (item1Found && item2Found) {
				break;
			}
		}

		if (item1Found) {
			System.out.println("Found the first item: " + item1 + " in the product list");
		} else {
			System.out.println("First item not found in the product list");
		}

		if (item2Found) {
			System.out.println("Found the second item: " + item2 + " in the product list");
		} else {
			System.out.println("Second item not found in the product list");
		}
	}
}
