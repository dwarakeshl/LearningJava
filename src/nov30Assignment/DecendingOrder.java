package nov30Assignment;

//Class to arrange numbers in descending order
public class DecendingOrder {
	// Array of numbers to be arranged
	int[] numbers = { 10, 50, 30, 20, 15 };

	// Method to arrange numbers in descending order
	void Descent() {
		// Outer loop to iterate through each element in the array
		for (int i = 0; i < numbers.length; i++) {
			// Inner loop to compare the current element with the remaining elements
			for (int j = i + 1; j < numbers.length; j++) {
				// Temporary variable to swap elements if needed
				int tmp;
				// Check if the current element is less than the next element
				if (numbers[i] < numbers[j]) {
					// Swap the elements if the condition is true
					tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
		// Print the sorted numbers in descending order
		System.out.println("Numbers in Descending Order:");
		// Iterate through the sorted array and print each number
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " ");
		}
	}
}
