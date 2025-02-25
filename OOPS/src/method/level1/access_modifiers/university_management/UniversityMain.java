package method.level1.access_modifiers.university_management;

public class UniversityMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student student1 = new Student(101, "Alice Johnson", 8.5);
	        
	        
	        student1.displayStudentDetails();

	        // Modify and access CGPA using public methods
	        student1.setCGPA(9.2);
	        System.out.println("Updated CGPA: " + student1.getCGPA());
	        System.out.println();

	        // Creating a Postgraduate Student object
	        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob Smith", 9.0, "Computer Science");
	        
	        // Display postgraduate student details
	        pgStudent.displayPostgraduateDetails();
	    }
	}


