package encap_poly.employee_management;

public class PartTimeEmployee extends Employee{
	 private int hoursWorked;
	    private double hourlyRate;

	    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
	        super(employeeId, name, 0); // Base salary not used directly
	        this.hoursWorked = hoursWorked;
	        this.hourlyRate = hourlyRate;
	    }

	    @Override
	    public double calculateSalary() {
	        return hoursWorked * hourlyRate;
	    }
}
