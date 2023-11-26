package nov24Assignment;
// Part 1 : Write a program which when given a phone brand name, shows all the available products present in that category. Please use the below table to create list of products for each category.
//Part 2:  After displaying all the available products, ask user to enter one product name.  
//Ensure user enters one of the displayed names.
// If user enters a name which is present in list, print  “product selected is : name of product “ 
// otherwise display an error message – “Please select a product from the list”

//Samsung	Google	Apple
//S20	Google Pixel 6	Iphone12
//S21	Google Pixel 6 Pro 	Iphone SE
//Flip3	Google Pixel Pro	Iphone 15
//Fold3	Google  Pixel 5	Iphone 13

//Main class
public class PhoneStoreMain {

	public static void main(String[] args) {
		
        PhoneStore phoneStore = new PhoneStore();
        phoneStore.displayProducts();
        
    }
}
