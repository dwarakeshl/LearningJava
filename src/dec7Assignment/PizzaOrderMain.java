package dec7Assignment;

public class PizzaOrderMain {

	public static void main(String[] args) {
		// Creating an object of the template class
		PizzaTemplate pizzaTemplate = new PizzaTemplate(null, null);
		pizzaTemplate.getOrderFromUser(null, true, true);
		pizzaTemplate.calculateBill(null, false, false);

	}

}