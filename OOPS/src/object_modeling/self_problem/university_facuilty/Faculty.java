package object_modeling.self_problem.university_facuilty;

public class Faculty {
	private String facultyName;
	
	Faculty(String facultyName){
		this.facultyName = facultyName;
	
	}
	
	//get the facultyName
	String getName() {
		return facultyName;
	}
}
