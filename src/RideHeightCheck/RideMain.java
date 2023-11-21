package rideHeightCheck;

import java.util.Scanner;

//Main class
public class RideMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RideHeight height = new RideHeight();
		System.out.println("Enter your height in centimeters: ");
		Scanner scanner = new Scanner(System.in);
		height.height = scanner.nextInt();
		height.checkHeight();
		scanner.close();
	}

}
