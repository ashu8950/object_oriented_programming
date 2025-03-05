package object_modeling.assisted_problem.company_department;

public class CompanyDepartmentComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company comp = new Company("Capgemini");
		comp.addDepartment("Developer");
		
		comp.addDepartment("HR");
		comp.addDepartment("Sales");
		
		comp.addEmployeeInDepartment("Developer","Ashu");
		comp.addEmployeeInDepartment("Developer","Ayush");
		
		comp.addEmployeeInDepartment("HR","Harsh");
		comp.addEmployeeInDepartment("HR","Raman");
		
		comp.addEmployeeInDepartment("Sales","Lokest");
		
		comp.displayCompany();
		
		comp.deleteCompany();
		
		comp.displayCompany();
		
		
		

	}

}
