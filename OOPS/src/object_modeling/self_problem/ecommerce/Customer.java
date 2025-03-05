package object_modeling.self_problem.ecommerce;
import java.util.ArrayList;

public class Customer {
	private String customerName;
	private ArrayList<Order>orders;
	Customer(String customerName){
		this.customerName = customerName;
		this.orders = new ArrayList<>();
	}
	
	public void placeOrder(Order order) {
		if(!orders.contains(order)) {
			orders.add(order);
			System.out.println(customerName + " placed an order with ID " + order.getOrderId());
		}
	}
	
	public void showOrder() {
		System.out.println(customerName + "'s Orders:");
		for(Order order :orders) {
			order.showOrderDetails();
		}
	}
	
	String getName() {
		return customerName;
	}
}
