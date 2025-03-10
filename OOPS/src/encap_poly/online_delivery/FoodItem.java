package encap_poly.online_delivery;

public abstract class FoodItem {
	 private String itemName;
	    private double price;
	    private int quantity;

	    // Constructor
	    public FoodItem(String itemName, double price, int quantity) {
	        this.itemName = itemName;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    // Getters
	    public String getItemName() { return itemName; }
	    public double getPrice() { return price; }
	    public int getQuantity() { return quantity; }

	    // Protected setters for encapsulated update
	    protected void setPrice(double price) { this.price = price; }
	    protected void setQuantity(int quantity) { this.quantity = quantity; }

	    // Abstract method
	    public abstract double calculateTotalPrice();

	    // Concrete method
	    public void getItemDetails() {
	        System.out.println("Item: " + itemName);
	        System.out.println("Unit Price: ₹" + price);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Total Price: ₹" + calculateTotalPrice());
	    }
}
