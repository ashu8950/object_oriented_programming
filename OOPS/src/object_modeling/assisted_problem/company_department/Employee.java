package object_modeling.assisted_problem.company_department;

public class Employee {
		String name;
		Employee(String name){
			this.name = name;
		}
		void displayName() {
			System.out.println("Name of a Employee is : "+name);
		}
}
