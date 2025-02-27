package keyword.programming_practices.employee_management;

public class EmployeeSystem {
	public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Aman", "Software Engineer");
        Employee emp2 = new Employee(2, "Adarsh", "Manager");

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        Employee.displayTotalEmployees();
    }

}
