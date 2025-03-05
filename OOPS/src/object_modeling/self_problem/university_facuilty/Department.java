package object_modeling.self_problem.university_facuilty;


public class Department {
	private String departmentName;
	
	Department(String departmentName){
		this.departmentName = departmentName;
	}
	
	//get the departmentName
	String getName() {
		return departmentName;
	}
}
