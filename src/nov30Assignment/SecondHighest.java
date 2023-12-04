package nov30Assignment;

public class SecondHighest {
	int[] numbers = { 5, 2, 8, 3, 10 };
	int highest = 0;
	int secondHighest = 0;

	void secondHighest() {

		for (int i = 0; i < numbers.length; i++) {
			// Check if the current number is greater than the highest
			if (numbers[i] > highest) {
				// Update secondHighest with the previous value of highest
				secondHighest = highest;
				// Update highest with the current number
				highest = numbers[i];
			}
		}
		// Print the second highest number after the loop
		System.out.println("The second highest number in the Array is: " + secondHighest);

	}
}
