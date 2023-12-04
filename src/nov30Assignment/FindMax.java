package nov30Assignment;

//Class to find the maximum number in an array
public class FindMax {
	// Array of numbers
	int[] numbers = { 10, 20, 30, 50, 11, 70 };
	// Variable to store the maximum number, initialized with the first element of
	// the array
	int max = numbers[0];

	// Method to find the maximum number in the array
	void maximum() {
		// Iterate through the array starting from the second element
		for (int i = 1; i < numbers.length; i++) {
			// Check if the current element is greater than the current maximum
			if (numbers[i] > max)
				// Update the maximum if the current element is greater
				max = numbers[i];
		}
		// Print the maximum number after the loop
		System.out.println("The maximum number is: " + max);
	}
}