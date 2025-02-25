package method.level1.instance_class.product_inventory;

public class Product {
	private String productName;
	private double price;
	private static int totalProducts=0;
	public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment count when a new product is created
    }
	 // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println();
    }

    // Static method to display total products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product("Laptop", 799.99);
        Product product2 = new Product("Smartphone", 499.99);
        Product product3 = new Product("Headphones", 99.99);

        // Display individual product details
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

        // Display total products
        Product.displayTotalProducts(); // Accessing static method
	}

}
