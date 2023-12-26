package dec22Assignment;

public class CruiseShip {
    private String cruiseName;
    private double adultPrice;
    private double kidPrice;
    private double childPrice;
    private int numDays;

    public CruiseShip(String cruiseName, double adultPrice, double kidPrice, double childPrice, int numDays) {
        this.cruiseName = cruiseName;
        this.adultPrice = adultPrice;
        this.kidPrice = kidPrice;
        this.childPrice = childPrice;
        this.numDays = numDays;
    }

    public String getCruiseName() {
        return cruiseName;
    }

    public double getAdultPrice() {
        return adultPrice;
    }

    public double getKidPrice() {
        return kidPrice;
    }

    public double getChildPrice() {
        return childPrice;
    }

    public int getNumDays() {
        return numDays;
    }

    public double calculatePrice(int numAdults, int numKids, int numChildren, boolean includeMeals) {
        double basePrice = (numAdults * adultPrice + numKids * kidPrice + numChildren * childPrice) * numDays;
        if (includeMeals) {
            basePrice += (numAdults * 20.99 + numKids * 4.99) * numDays;
        }
        return basePrice;
    }

    public void displayCruiseDetails() {
        System.out.println("The cruise that you have selected is " + cruiseName + " which is a " + numDays + " day cruise");
        System.out.println("Price for Adults (>12): $" + adultPrice + " per day");
        System.out.println("Price for Kids (>5): $" + kidPrice + " per day");
        System.out.println("Price for Children (<=5): $" + childPrice + " per day");
    }
}