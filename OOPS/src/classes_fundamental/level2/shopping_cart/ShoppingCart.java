package classes_fundamental.level2.shopping_cart;
import java.util.ArrayList;
public class ShoppingCart {
	 private ArrayList<Cart> items;

	    public ShoppingCart() {
	        this.items = new ArrayList<>();
	    }

	    public void addItem(String itemName, double price, int quantity) {
	        items.add(new Cart(itemName, price, quantity));
	        System.out.println(quantity + " " + itemName + "(s) added to cart.");
	    }

	    public void removeItem(String itemName) {
	        items.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));
	        System.out.println(itemName + " removed from cart.");
	    }

	    public void displayTotalCost() {
	        double total = 0;
	        for (Cart item : items) {
	            total += item.getTotalPrice();
	        }
	        System.out.println("Total Cost: $" + String.format("%.2f", total));
	    }

}
