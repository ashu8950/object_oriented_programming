package object_modeling.assisted_problem.company_department;
import java.util.ArrayList;

public class Department {
	String departName;
	ArrayList<Employee>employees;
	Department(String name){
		this.departName = name;
		this.employees = new ArrayList<>();
	}
	
	void addEmployee(String emp) {
		employees.add(new Employee(emp));
	}
	
	void displayDepartment() {
		System.out.println();
		System.out.println("Name of the department : "+departName);
		for(Employee emp : employees) {
			emp.displayName();
		}
	}
	
	
}
