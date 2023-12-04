package nov30Assignment;

public class ReplaceArray {
	int[] numbers = { 3, 8, 2, 10, 5, 7 };
	boolean isPrime;

	// Method to replace prime numbers with "prime" in the array
	void replacePrimes() {
		System.out.print("Array elements: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];

			// Check if the number is prime
			boolean isPrime = true;
			if (num > 1) {
				for (int j = 2; j <= Math.sqrt(num); j++) {
					if (num % j == 0) {
						isPrime = false;
						break;
					}
				}
			} else {
				isPrime = false;
			}

			// Replace prime numbers with -1 (use any placeholder value)
			if (isPrime) {
				numbers[i] = -1;
			}
		}
	}

	// Method to print the modified array
	void printModifiedArray() {
		replacePrimes();

		// Replace placeholder value with "Prime" while printing
		System.out.print("\n" + "Modified Array:");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == -1) {
				System.out.print("Prime ");
			} else {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println(); // Move to the next line after printing the array
	}
}