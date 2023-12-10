package dec7Assignment;

public class PizzaOrderMain {

	public static void main(String[] args) {
		// Creating an object of the template class
		PizzaTemplate pizzaTemplate = new PizzaTemplate();
		pizzaTemplate.getOrderFromUser();
		pizzaTemplate.calculateBill();

	}

}
