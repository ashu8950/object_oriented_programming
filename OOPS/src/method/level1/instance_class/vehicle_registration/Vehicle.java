package method.level1.instance_class.vehicle_registration;

public class Vehicle {

	private String ownerName;
    private String vehicleType;
    private static double registrationFee = 100.0; 

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
        System.out.println();
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Vehicle vehicle1 = new Vehicle("John Doe", "Car");
	        Vehicle vehicle2 = new Vehicle("Alice Smith", "Bike");

	        // Display initial vehicle details
	        vehicle1.displayVehicleDetails();
	        vehicle2.displayVehicleDetails();

	        // Update registration fee
	        Vehicle.updateRegistrationFee(150.0);

	        // Display updated vehicle details
	        System.out.println("After Registration Fee Update:\n");
	        vehicle1.displayVehicleDetails();
	        vehicle2.displayVehicleDetails();

	}

}
