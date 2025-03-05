package object_modeling.assisted_problem.company_department;
import java.util.ArrayList;

public class Company {
	String companyName;
	ArrayList<Department>departments;
	Company(String companyName){
		this.companyName = companyName;
		this.departments = new ArrayList<>();
	}
	
	void addDepartment(String depName) {
		departments.add(new Department(depName));
	}
	
	void addEmployeeInDepartment(String depName,String empName) {
		for(Department dep : departments) {
			if(dep.departName.equals(depName)) {
				dep.addEmployee(empName);
				return;
			}
		}
		System.out.println("Department not found"); 
		
	}
	
	void displayCompany() {
		System.out.println("Name of the company : "+companyName);
		for(Department dep : departments) {
			dep.displayDepartment();
		}
	}
	
	void deleteCompany() {
		departments.clear();
		System.out.println();
		System.out.println("All department data of "+companyName+"has been deleted");
	}
	
}
