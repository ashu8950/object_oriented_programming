package object_modeling.self_problem.university_facuilty;
import java.util.ArrayList;

public class University {
		private String universityName;
		private ArrayList<Department>departments;
		University(String universityName){
			this.universityName = universityName;
			this.departments = new ArrayList<>();
		}
		public void addDepartment(Department department) {
			if(!departments.contains(department)) {
				departments.add(department);
			}
		}
		
		//deleting university deletes it's department
		
		public void removeDepartment() {
			departments.clear();
		}
		
		//show department
		
		public ArrayList<String> showDepartment(){
			ArrayList<String>departmentName = new ArrayList<>();
			for(Department depart : departments) {
				departmentName.add(depart.getName());
			}
			return departmentName;
		}
		
		String getName() {
			return universityName;
		}
		
}
