package object_modeling.self_problem.university_facuilty;

public class UniversityCompAggr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University university = new University("Tech University");
        Department csDepartment = new Department("Computer Science");
        Department mathDepartment = new Department("Mathematics");

        Faculty professor = new Faculty("Dr. Smith"); // Faculty exists independently

        // Adding departments to the university
        university.addDepartment(csDepartment);
        university.addDepartment(mathDepartment);

        // Show departments before deletion
        System.out.println("Departments in " + university.getName() + ": " + university.showDepartment());

        // Deleting university departments
        university.removeDepartment();
        System.out.println("Departments after university deletion: " + university.showDepartment()); // Empty list

        // Faculty remains even after university departments are removed
        System.out.println("Faculty member: " + professor.getName());
	}

}
