package classes_fundamental.level2.shopping_cart;

public class Cart {
	 private String itemName;
	    private double price;
	    private int quantity;

	    public Cart(String itemName, double price, int quantity) {
	        this.itemName = itemName;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    public double getTotalPrice() {
	        return price * quantity;
	    }

	    public String getItemName() {
	        return itemName;
	    }

	    public int getQuantity() {
	        return quantity;
	    }
}
