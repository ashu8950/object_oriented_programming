package keyword.programming_practices.vehicle_registration;

public class Vehicle {
	 private static double registrationFee = 500; // Static variable
	    private final String registrationNumber; // Final variable
	    private String ownerName;
	    private String vehicleType;

	    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
	        this.registrationNumber = registrationNumber;
	        this.ownerName = ownerName;
	        this.vehicleType = vehicleType;
	    }

	    public void displayVehicleDetails() {
	        if (this instanceof Vehicle) { // Using instanceof
	            System.out.println("Registration Number: " + registrationNumber);
	            System.out.println("Owner Name: " + ownerName);
	            System.out.println("Vehicle Type: " + vehicleType);
	            System.out.println("Registration Fee: Rs." + registrationFee);
	        }
	    }

}
