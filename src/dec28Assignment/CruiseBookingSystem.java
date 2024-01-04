package dec28Assignment;

import java.util.Scanner;

public class CruiseBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message and user registration
        System.out.println("Welcome to Cruise Booking. Please sign up to book a cruise.");
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        System.out.print("Enter the password that you want to use: ");
        String password = scanner.nextLine();
        System.out.print("Enter your Full Name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        // Create a User object with the provided user details
        User user = new User(email, password, fullName, phoneNumber);
        System.out.println("Thank you for registering!");
        user.displayUserInfo();

        // Select a cruise and display its information
        CruiseShip selectedCruise = selectCruise(scanner);
        selectedCruise.displayCruiseInfo();

        // Get the number of adults and children, and their ages
        int numAdults = CruiseShip.getNumberOfPassengers(scanner, "adults");
        int numChildren = CruiseShip.getNumberOfPassengers(scanner, "children");
        int[] childAges = getChildrenAges(scanner, numChildren);

        // Ask the user if they want to include meals
        boolean includeMeals = CruiseShip.askForMeals(scanner);

        // Display the itemized bill for the selected cruise
        selectedCruise.displayItemizedBill(numAdults, numChildren, includeMeals, childAges);

        // Ask the user if they want to change their personal information
        boolean changePersonalInfo = askToChangePersonalInfo(scanner, user);
        if (changePersonalInfo) {
            // Change the user's information based on their choice
            changeUserInfo(scanner, user);
        }

        System.out.println("Thank you for using the service!");

        // Close the scanner
        scanner.close();
    }

    // Select a cruise based on user input
    private static CruiseShip selectCruise(Scanner scanner) {
        System.out.println("We offer the following cruises:");
        System.out.println("1. Scenic Cruise");
        System.out.println("2. Sunset Cruise");
        System.out.println("3. Discovery Cruise");
        System.out.println("4. Mystery Cruise");

        System.out.print("Enter the cruise number that you want to select: ");
        int cruiseNumber = scanner.nextInt();

        // Return the corresponding cruise based on the user's choice
        switch (cruiseNumber) {
            case 1:
                return new ScenicCruise();
            case 2:
                return new SunsetCruise();
            case 3:
                return new DiscoveryCruise();
            case 4:
                return new MysteryCruise();
            default:
                System.out.println("Invalid cruise selection. Exiting...");
                System.exit(1);
                return null; // This line is never reached, added to satisfy the compiler
        }
    }

    // Get the ages of children from the user
    private static int[] getChildrenAges(Scanner scanner, int numChildren) {
        int[] childAges = new int[numChildren];
        for (int i = 0; i < numChildren; i++) {
            System.out.print("Enter the age of child " + (i + 1) + ": ");
            childAges[i] = scanner.nextInt();
        }
        return childAges;
    }

    // Ask the user if they want to change their personal information
    private static boolean askToChangePersonalInfo(Scanner scanner, User user) {
        System.out.print("\nDo you want to change your personal information? Press Y to change. Press any other alphabet to exit: ");
        char response = scanner.next().charAt(0);
        return (response == 'Y' || response == 'y');
    }

    // Change the user's information based on their choice
    private static void changeUserInfo(Scanner scanner, User user) {
        System.out.println("\nPlease enter the information you want to change:");
        System.out.println("1. Password");
        System.out.println("2. Phone number");
        System.out.println("3. Email");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                user.changePassword(scanner);
                break;
            case 2:
                user.changePhoneNumber(scanner);
                break;
            case 3:
                user.changeEmail(scanner);
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                System.exit(1);
        }
    }
}
