package inheritance.multilevel_inheritance.order_management;

public class ShippedOrder extends Order {
	protected String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped - Tracking Number: " + trackingNumber;
    }
}
