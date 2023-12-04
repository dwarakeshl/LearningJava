package nov30Assignment;
//Import the Arrays class from the java.util package to use sorting functionality
import java.util.Arrays;
//Template Class
public class SortArray {
	// Array of integers to be sorted
	int[] numbers = {5, 2, 8, 3, 1};
	// Method to perform sorting and print the sorted array
	void Sort() {
		// Arrays.sort() method to sort the elements in the numbers array in ascending order.
    Arrays.sort(numbers);
    // Print the sorted array
    System.out.println(Arrays.toString(numbers));
}
}
