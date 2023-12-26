package dec22Assignment;
import java.util.Scanner;
public class CruiseBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("We offer 4 different packages as displayed below. Please enter the cruise that you want to select.");
        System.out.println("1. Scenic Cruise\n2. Sunset Cruise\n3. Discovery Cruise\n4. Mystery Cruise");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        CruiseShip selectedCruise = null;
        switch (choice) {
            case 1:
                selectedCruise = new ScenicCruise();
                break;
            case 2:
                selectedCruise = new SunsetCruise();
                break;
            case 3:
                selectedCruise = new DiscoveryCruise();
                break;
            case 4:
                selectedCruise = new MysteryCruise();
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                System.exit(0);
        }

        selectedCruise.displayCruiseDetails();

        System.out.print("\nEnter the number of adults: ");
        int numAdults = scanner.nextInt();

        System.out.print("Enter the number of kids aged between 6 to 12: ");
        int numKids = scanner.nextInt();

        System.out.print("Enter the number of children aged between 0 to 5: ");
        int numChildren = scanner.nextInt();

        System.out.print("Do you want to pre-book for dinner buffet meals? (Yes/No): ");
        boolean includeMeals = scanner.next().equalsIgnoreCase("Yes");

        double totalPrice = selectedCruise.calculatePrice(numAdults, numKids, numChildren, includeMeals);
        double hst = totalPrice * 0.15;
        double finalPrice = totalPrice + hst;

        System.out.println("\nYour Package includes:");
        System.out.println(selectedCruise.getCruiseName());
        System.out.println("Adults: " + numAdults + " x $" + selectedCruise.getAdultPrice() + " = $" + (numAdults * selectedCruise.getAdultPrice() * selectedCruise.getNumDays()));
        System.out.println("Kids aged between 6 to 12: " + numKids + " x $" + selectedCruise.getKidPrice() + " = $" + (numKids * selectedCruise.getKidPrice() * selectedCruise.getNumDays()));
        System.out.println("Children aged between 0 to 5: " + numChildren + " x $" + selectedCruise.getChildPrice() + " = $" + (numChildren * selectedCruise.getChildPrice() * selectedCruise.getNumDays()));
        System.out.println("Buffet Special Price Adults: " + numAdults + " x $20.99 = $" + (numAdults * 20.99 * selectedCruise.getNumDays()));
        System.out.println("Buffet Special Price Kids between 6 to 12: " + numKids + " x $4.99 = $" + (numKids * 4.99 * selectedCruise.getNumDays()));
        System.out.println("Buffet Special Price children between 0 to 5: " + numChildren + " x $0.00 = $0.00");
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("HST (15%): $" + hst);
        System.out.println("Final Price: $" + finalPrice);

        scanner.close();
    }
}