package encap_poly.employee_management;

public abstract class Employee implements Department {
	 private int employeeId;
	    private String name;
	    private double baseSalary;
	    private String department;

	    // Constructor
	    public Employee(int employeeId, String name, double baseSalary) {
	        this.employeeId = employeeId;
	        this.name = name;
	        this.baseSalary = baseSalary;
	    }

	    // Getters and Setters
	    public int getEmployeeId() { return employeeId; }
	    public String getName() { return name; }
	    public double getBaseSalary() { return baseSalary; }
	    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

	    // Abstract Method
	    public abstract double calculateSalary();

	    // Concrete Method
	    public void displayDetails() {
	        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
	        System.out.println("Department: " + department);
	        System.out.println("Total Salary: " + calculateSalary());
	    }

	    // Department Interface Implementation
	    public void assignDepartment(String departmentName) {
	        this.department = departmentName;
	    }

	    public String getDepartmentDetails() {
	        return "Department: " + department;
	    }
}
