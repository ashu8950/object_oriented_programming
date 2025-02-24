package classes_fundamental.level1.track_inventory;

public class ItemDetailsAndQuantity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item1 = new Item("I001", "Laptop", 1200.50);
        Item item2 = new Item("I002", "Smartphone", 850.75);

        item1.displayDetails();
        System.out.println("Total Cost for 2 units: $" + String.format("%.2f", item1.calculateTotalCost(2)));
        System.out.println();  
        item2.displayDetails();
        System.out.println("Total Cost for 3 units: $" + String.format("%.2f", item2.calculateTotalCost(3)));

	}

}
