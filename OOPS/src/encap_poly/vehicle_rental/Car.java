package encap_poly.vehicle_rental;

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + maskPolicyNumber();
    }

    private String maskPolicyNumber() {
        // Only show last 4 digits
        return "****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}
