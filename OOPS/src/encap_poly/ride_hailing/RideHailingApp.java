package encap_poly.ride_hailing;

public class RideHailingApp {
	public static void processRides(Vehicle[] vehicles, double distance) {
        System.out.println("=== Ride Fare Summary ===");
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Current Location: " + v.getCurrentLocation());
            System.out.println("Fare for " + distance + " km: ₹" + v.calculateFare(distance));
            System.out.println("--------------------------");
        }
    }

    public static void main(String[] args) {
        // Create sample vehicles
        Vehicle[] rides = new Vehicle[] {
            new Car("CAR101", "Alice", 15.0, "MG Road"),
            new Bike("BIKE202", "Bob", 8.0, "Indiranagar"),
            new Auto("AUTO303", "Charlie", 10.0, "Whitefield")
        };

        // Update location (using interface GPS)
        for (Vehicle v : rides) {
            if (v instanceof GPS) {
                ((GPS) v).updateLocation("Koramangala");
            }
        }

        // Process all rides for 12 km
        processRides(rides, 12.0);
    }
}
