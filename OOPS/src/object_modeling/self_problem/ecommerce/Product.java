package object_modeling.self_problem.ecommerce;

public class Product {
	private String productName;
	private double price;
	Product(String productName ,double price){
		this.productName = productName;
		this.price = price;
	}
	
	double getPrice() {
		return price;
	}
	
	String getName() {
		return productName;
	}
}
