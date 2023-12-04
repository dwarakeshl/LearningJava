package nov30Assignment;
//Template Class
public class ReverseArray {
	int[] numbers = {3, 8, 2, 10, 5, 7};
	// Method to reverse the array in place
	void Reverse() {
		// Initialize start and end indices for swapping
		int start = 0;
        int end = numbers.length - 1;
     // Use a while loop to swap elements until the start index crosses the end index
        while (start < end) {
            // Swap elements at start and end indices
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            // Move indices towards the center
            start = start + 1;
            end = end - 1;
        }
    }

    // Method to print the reversed array
    void PrintReversedArray() {
        System.out.println("Reversed Array:");
     // Use a for loop to iterate through the array and print each element
        for (int i = 0; i < numbers.length; i = i + 1) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // Move to the next line after printing the array
    }
}
