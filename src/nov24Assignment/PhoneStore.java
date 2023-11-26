package nov24Assignment;

import java.util.Scanner;

public class PhoneStore {
	Scanner scanner = new Scanner(System.in);
	String[] samsungProducts = { "S20", "S21", "Flip3", "Fold3" };
	String[] googleProducts = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
	String[] appleProducts = { "iPhone12", "iPhone SE", "iPhone 15", "iPhone 13" };
	String brand;
	int productNumber;
	boolean shouldRestart = true;

	void displayProducts() {
		System.out.println("Enter the phone brand (Samsung, Google, or Apple):");
		brand = scanner.nextLine();
		while(shouldRestart)
		switch (brand) {
		case "Samsung":
			System.out.println("Available products for " + brand + ":");
			for (int i = 0; i < samsungProducts.length; i++) {
				System.out.println((i + 1) + ". " + samsungProducts[i]);
			}
			System.out.println("Enter the number corresponding to the product you want to select:");
			productNumber = scanner.nextInt();
			System.out.println("Product selected is: " + samsungProducts[productNumber - 1]);
			shouldRestart=false;
			break;
		case "Google":
			System.out.println("Available products for " + brand + ":");
			for (int i = 0; i < googleProducts.length; i++) {
				System.out.println((i + 1) + ". " + googleProducts[i]);
			}
			System.out.println("Enter the number corresponding to the product you want to select:");
			productNumber = scanner.nextInt();
			System.out.println("Product selected is: " + googleProducts[productNumber - 1]);
			shouldRestart=false;
			break;
		case "Apple":
			System.out.println("Available products for " + brand + ":");
			for (int i = 0; i < appleProducts.length; i++) {
				System.out.println((i + 1) + ". " + appleProducts[i]);
			}
			System.out.println("Enter the number corresponding to the product you want to select:");
			productNumber = scanner.nextInt();
			System.out.println("Product selected is: " + appleProducts[productNumber - 1]);
			shouldRestart=false;
			break;
		default:
			System.out.println("Invalid brand selection.Please Try again");
			brand = scanner.nextLine();
			shouldRestart=true;
		}
		scanner.close();
	}
}
