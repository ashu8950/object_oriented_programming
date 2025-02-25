package method.level1.access_modifiers.university_management;

public class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);  
        System.out.println("Name: " + name);  
        System.out.println("CGPA: " + getCGPA());  
        System.out.println("Specialization: " + specialization);
        System.out.println();
    }
}