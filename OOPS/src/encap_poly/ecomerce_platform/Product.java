package encap_poly.ecomerce_platform;

public abstract class Product {
	private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation: Getters and Setters
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Abstract method
    public abstract double calculateDiscount();

    // Method to calculate final price
    public double getFinalPrice() {
        double tax = (this instanceof Taxable) ? ((Taxable) this).calculateTax() : 0;
        return price + tax - calculateDiscount();
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: " + price);
        System.out.println("Discount: " + calculateDiscount());
        if (this instanceof Taxable) {
            System.out.println("Tax: " + ((Taxable) this).calculateTax());
        } else {
            System.out.println("Tax: Not Applicable");
        }
        System.out.println("Final Price: " + getFinalPrice());
        System.out.println("--------------------------------");
    }
}
