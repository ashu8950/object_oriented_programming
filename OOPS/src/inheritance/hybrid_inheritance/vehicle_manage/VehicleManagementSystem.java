package inheritance.hybrid_inheritance.vehicle_manage;

public class VehicleManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ElectricVehicle tesla = new ElectricVehicle("Tesla Model S", 250, 100);
	        PetrolVehicle ford = new PetrolVehicle("Ford Mustang", 220, 60);

	        tesla.displayDetails();
	        tesla.charge();
	        System.out.println();
	        
	        ford.displayDetails();
	        ford.refuel();
	}

}
