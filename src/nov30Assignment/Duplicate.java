package nov30Assignment;

public class Duplicate {
	int[] numbers = {3, 5, 7, 3, 2, 7, 8, 5, 9, 3, 2, 7};
	int Count;
	void FindDuplicates() {
		for (int i = 0; i < numbers.length; i++) {
            Count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    Count++;
                }
            }
            if (Count > 1) {
                System.out.println(numbers[i] + " appears " + Count + " times");
            }
        }
	}
}
