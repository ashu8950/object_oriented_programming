package inheritance.hybrid_inheritance.restaurant;

public class RestaurantManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chef chef = new Chef("Gordon Ramsay", 101, "Italian");
        Waiter waiter = new Waiter("John Doe", 202, 5);

        chef.displayDetails();
        chef.performDuties();
        System.out.println();
        
        waiter.displayDetails();
        waiter.performDuties();
	}

}
