package nov30Assignment;
//Template Class
public class SmallAndLarge {
	int[] Numbers = {3, 8, 2, 10, 5, 7};
	int min = Numbers[0];
	int max = Numbers[0];
	void findSmallAndLarge() {
		for (int i = 1; i < Numbers.length; i = i + 1) {
            // Compare each element with the current minimum
            if (Numbers[i] < min) {
                min = Numbers[i];
            }

            // Compare each element with the current maximum
            if (Numbers[i] > max) {
                max = Numbers[i];
            }
        }

        // Print the results
        System.out.println("Smallest number in the array: " + min);
        System.out.println("Largest number in the array: " + max);
    }
	}
