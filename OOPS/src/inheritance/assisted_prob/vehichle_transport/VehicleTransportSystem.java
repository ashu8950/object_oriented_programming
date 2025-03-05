package inheritance.assisted_prob.vehichle_transport;

public class VehicleTransportSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vehicles = {
	            new Car(200, "Petrol", 5),
	            new Truck(120, "Diesel", 15.5),
	            new Motorcycle(180, "Petrol", false)
	        };
	        
	        // Display information for each vehicle
	        for (Vehicle v : vehicles) {
	            v.displayInfo();
	            System.out.println();
	        }
	}

}
