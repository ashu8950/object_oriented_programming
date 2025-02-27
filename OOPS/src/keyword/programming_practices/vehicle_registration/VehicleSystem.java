package keyword.programming_practices.vehicle_registration;

public class VehicleSystem {
	public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("XYZ123", "Aman", "Car");
        Vehicle vehicle2 = new Vehicle("ABC789", "Raj", "Motorcycle");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }

}
