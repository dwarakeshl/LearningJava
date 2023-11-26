package nov24Assignment;
//Template class

public class PairSumFinder {
	int[] numbers = { -40, -5, 1, 3, 6, 7, 8, 20 };
	int targetSum = 15;

	void findPairsWithSum() {
		System.out.println("Pairs with sum " + targetSum + ":");
		// The outer loop (i) iterates from the beginning of the array to the
		// second-to-last element
		for (int i = 0; i < numbers.length - 1; i++) {
			// the inner loop (j) iterates from the element after the outer loop index to
			// the last element.
			for (int j = i + 1; j < numbers.length; j++) {
				// check if the sum of the current pair equals the target sum. If true, it
				// prints the pair.
				if (numbers[i] + numbers[j] == targetSum) {
					System.out.println("(" + numbers[i] + ", " + numbers[j] + ")");
				}
			}
		}
	}
}