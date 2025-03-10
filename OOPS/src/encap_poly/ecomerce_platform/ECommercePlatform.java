package encap_poly.ecomerce_platform;

public class ECommercePlatform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Product[] products = new Product[] {
		            new Electronics(201, "Laptop", 80000),
		            new Clothing(202, "T-Shirt", 2000),
		            new Groceries(203, "Rice Bag", 1500)
		        };

		        System.out.println("=== Product Summary ===");
		        for (Product product : products) {
		            product.displayProductDetails();
		        }
		    

	}

}
