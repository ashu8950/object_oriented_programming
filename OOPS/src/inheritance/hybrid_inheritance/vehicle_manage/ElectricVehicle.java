package inheritance.hybrid_inheritance.vehicle_manage;

public class ElectricVehicle extends Vehicle{
	private int batteryCapacity;

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println(model + " is charging with battery capacity: " + batteryCapacity + " kWh.");
    }
}
