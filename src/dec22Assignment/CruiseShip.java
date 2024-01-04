package dec22Assignment;

//CruiseShip Parent class represents a generic cruise with details such as name, prices, and duration.
public class CruiseShip {
	// Private fields to store cruise details
	private String cruiseName;
	private double adultPrice;
	private double childPrice;
	private int numDays;

	// Constructor to initialize cruise details
	public CruiseShip(String cruiseName, double adultPrice, double childPrice, int numDays) {
		this.cruiseName = cruiseName;
		this.adultPrice = adultPrice;
		this.childPrice = childPrice;
		this.numDays = numDays;
	}
	// Getter methods to retrieve cruise details
	public String getCruiseName() {
		return cruiseName;
	}

	public double getAdultPrice() {
		return adultPrice;
	}

	public double getChildPrice() {
		return childPrice;
	}

	public int getNumDays() {
		return numDays;
	}
	// Method to calculate the total price of the cruise based on the number of guests and meal inclusion
	public double calculatePrice(int numAdults, int numChildren, boolean includeMeals) {
		double basePrice = (numAdults * adultPrice + numChildren * childPrice) * numDays;
		if (includeMeals) {
			basePrice += (numAdults * 20.99 + numChildren * 4.99) * numDays;
		}
		return basePrice;
	}
	// Method to display basic cruise details
	public void displayCruiseDetails() {
		System.out.println("The cruise that you have selected is " + cruiseName + " which is a " + numDays + " day cruise");
		System.out.println("Price for Adults (>12): $" + adultPrice + " per day");
		System.out.println("Price for Children (<=5): $" + childPrice + " per day");
	}
}