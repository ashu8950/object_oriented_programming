package encap_poly.employee_management;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new FullTimeEmployee(101, "Alice", 50000, 10000);
        Employee emp2 = new PartTimeEmployee(102, "Bob", 200, 120);

        emp1.assignDepartment("HR");
        emp2.assignDepartment("Support");

        Employee[] employees = {emp1, emp2};

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("-----------------------");
        }
	}

}
