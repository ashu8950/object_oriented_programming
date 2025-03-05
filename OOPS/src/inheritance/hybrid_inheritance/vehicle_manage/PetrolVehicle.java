package inheritance.hybrid_inheritance.vehicle_manage;

public class PetrolVehicle extends Vehicle implements Refuelable{
	private int fuelCapacity;

    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling with capacity: " + fuelCapacity + " liters.");
    }
}
