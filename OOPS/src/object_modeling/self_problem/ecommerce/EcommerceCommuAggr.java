package object_modeling.self_problem.ecommerce;

public class EcommerceCommuAggr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer("Alice");
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Smartphone", 800.00);

        Order order1 = new Order(101);
        order1.addProduct(product1);
        order1.addProduct(product2);

        customer1.placeOrder(order1);
        customer1.showOrder();
	}

}
