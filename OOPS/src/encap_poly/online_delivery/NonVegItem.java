package encap_poly.online_delivery;
class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0;
    private final double nonVegCharge = 30.0; // flat charge per item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double base = (getPrice() + nonVegCharge) * getQuantity();
        return base - (base * discount / 100);
    }

    @Override
    public void applyDiscount(double percentage) {
        this.discount = percentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discount + "% (Includes non-veg charge ₹" + nonVegCharge + " per item)";
    }
}
