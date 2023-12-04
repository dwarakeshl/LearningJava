package nov30Assignment;

import java.util.Scanner;

//Template Class
public class FibonacciSeries {
	int n;
	int First = 1;
	int Second = 1;

	void PrintFibonacci() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number upto which Fibonacci series to print: ");
		n = scanner.nextInt();
		System.out.println("Fibonacci series up to " + n + ":");
		// Print the first and second terms of the series
		System.out.print(First + " " + Second + " ");
		// Use a while loop to generate and print the Fibonacci series
		while (First + Second <= n) {
			// Calculate the next term in the series
			int next = First + Second;
			// Print the next term
			System.out.print(next + " ");
			// Update the values of First and Second for the next iteration
			First = Second;
			Second = next;
		}

		System.out.println(); // Move to the next line after printing the series
		scanner.close();
	}
}
