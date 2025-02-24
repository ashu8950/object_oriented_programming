package classes_fundamental.level1.employee_details;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("John Doe", 101, 50000.00);
        Employee emp2 = new Employee("Jane Smith", 102, 60000.00);

        emp1.displayDetails();
        System.out.println();  
        emp2.displayDetails();

	}

}
