package object_modeling.self_problem.ecommerce;
import java.util.ArrayList;

public class Order {
	private int orderId;
	private ArrayList<Product>products;
	Order(int orderId){
		this.orderId = orderId;
		this.products = new ArrayList<>();
	}
	
	 public void addProduct(Product product) {
	        products.add(product);
	    }

	 public void showOrderDetails() {
	      System.out.println("Order ID: " + orderId);
	      for (Product product : products) {
	          System.out.println(" - " + product.getName() + ": $" + product.getPrice());
	      }
	  }
	 
	 int getOrderId() {
		 return orderId;
	 }

}
