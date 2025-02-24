package classes_fundamental.level2.shopping_cart;

public class CartItem {
		public static void main(String[]args) {
			ShoppingCart cart = new ShoppingCart();
	        cart.addItem("Laptop", 1200.50, 1);
	        cart.addItem("Mouse", 25.99, 2);
	        cart.displayTotalCost();
	        cart.removeItem("Mouse");
	        cart.displayTotalCost();
		}
}
