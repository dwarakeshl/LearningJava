package nov30Assignment;

import java.util.Scanner;

public class PrimeNumberChecker {
	int num;
	boolean isPrime;

	// Method to check if the number is prime
	void Checker() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num = scanner.nextInt();
		// 0 and 1 are not prime numbers
		if (num <= 1) {
			isPrime = false;
		} else {
			// Check for factors from 2 to num-1
			for (int i = 2; i < num; i = i + 1) {
				// Check if num is divisible by i
				if (num % i == 0) {
					isPrime = false;
					break;// exit the loop if a divisor is found
				}
			}
		}
		// If no divisors found, the number is prime
		if (isPrime) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}

		scanner.close();
	}

}
