package classes_fundamental.level1.phone_details;

public class Mobile {
	private String brand;
    private String model;
    private double price;

    public Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + String.format("%.2f", price));
    }
}
