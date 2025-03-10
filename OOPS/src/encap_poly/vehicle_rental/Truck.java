package encap_poly.vehicle_rental;

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // Flat service fee
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.08; // 8% insurance cost
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + maskPolicyNumber();
    }

    private String maskPolicyNumber() {
        return "****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}