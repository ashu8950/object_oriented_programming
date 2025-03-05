package inheritance.hierarchical_inheritance.school;

public class SchoolManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 16, 10);
        Staff staff = new Staff("Charlie", 40, "Administration");

        teacher.displayDetails();
        teacher.displayRole();
        System.out.println();
        
        student.displayDetails();
        student.displayRole();
        System.out.println();
        
        staff.displayDetails();
        staff.displayRole();
	}

}
