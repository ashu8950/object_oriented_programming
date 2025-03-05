package inheritance.single_inheritance.home_system;

public class SmartHomeSystem {
	 public static void main(String[]args) {
		 Thermostat thermostat = new Thermostat("TH123", "Active", 22.5);
	        
	        // Display thermostat status
	        thermostat.displayStatus();
	 }
}
