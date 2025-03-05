package inheritance.multilevel_inheritance.order_management;

public class OrderManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order(1001, "2025-03-05");
        ShippedOrder shippedOrder = new ShippedOrder(1002, "2025-03-04", "TRK123456");
        DeliveredOrder deliveredOrder = new DeliveredOrder(1003, "2025-03-03", "TRK654321", "2025-03-06");

        order.displayOrderDetails();
        System.out.println();
        shippedOrder.displayOrderDetails();
        System.out.println();
        deliveredOrder.displayOrderDetails();
	}

}
