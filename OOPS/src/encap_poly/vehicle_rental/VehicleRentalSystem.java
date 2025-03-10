package encap_poly.vehicle_rental;

public class VehicleRentalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] fleet = new Vehicle[] {
	            new Car("CAR123", 1500, "INS123456789"),
	            new Bike("BIKE456", 500),
	            new Truck("TRUCK789", 3000, "TRK987654321")
	        };

	        int rentalDays = 5;

	        System.out.println("=== Vehicle Rental Summary ===");
	        for (Vehicle vehicle : fleet) {
	            vehicle.displayDetails(rentalDays);
	        }
	}

}
