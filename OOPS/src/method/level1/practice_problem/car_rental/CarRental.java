package method.level1.practice_problem.car_rental;

public class CarRental {
	private String customerName;
	private String carModel;
	private int rentalDays;
	private double dailyRate;

	private CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Method to calculate total cost
    private double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Display rental details
    private void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Cost: $" + calculateTotalCost());
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarRental rental1 = new CarRental("John Doe", "Toyota Corolla", 5, 40.0);
        CarRental rental2 = new CarRental("Alice Smith", "Honda Civic", 3, 45.0);
        
        // Display rental details
        rental1.displayDetails();
        rental2.displayDetails();

	}

}
