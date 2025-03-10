package encap_poly.online_delivery;
	public class FoodDeliverySystem {
	    // Unified order handler
	    public static void processOrder(FoodItem[] orderItems) {
	        System.out.println("=== Order Summary ===");
	        for (FoodItem item : orderItems) {
	            item.getItemDetails();
	            if (item instanceof Discountable) {
	                Discountable d = (Discountable) item;
	                System.out.println(d.getDiscountDetails());
	            }
	            System.out.println("---------------------");
	        }
	    }

	    // Main method
	    public static void main(String[] args) {
	        FoodItem[] order = new FoodItem[] {
	            new VegItem("Paneer Tikka", 180, 2),
	            new NonVegItem("Chicken Biryani", 250, 1),
	            new NonVegItem("Mutton Kebab", 300, 2)
	        };

	        // Apply some discounts
	        ((Discountable) order[0]).applyDiscount(10); // 10% on Veg
	        ((Discountable) order[1]).applyDiscount(5);  // 5% on Non-Veg
	        ((Discountable) order[2]).applyDiscount(7);  // 7% on Non-Veg

	        // Process all items
	        processOrder(order);
	    }

}
