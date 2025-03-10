package encap_poly.vehicle_rental;

public abstract class Vehicle {
	private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    // Abstract Method
    public abstract double calculateRentalCost(int days);

    // Display Method
    public void displayDetails(int days) {
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
        System.out.println("Rental Cost for " + days + " days: " + calculateRentalCost(days));
        if (this instanceof Insurable) {
            System.out.println("Insurance: " + ((Insurable) this).calculateInsurance());
            System.out.println(((Insurable) this).getInsuranceDetails());
        } else {
            System.out.println("Insurance: Not applicable");
        }
        System.out.println("--------------------------------");
    }
}
