package method.level1.instance_class.course_management;

public class Course {

	private String courseName;
    private int duration; 
    private double fee;
    private static String instituteName = "CUIET"; 

    
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
        System.out.println();
    }

    // Static method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 = new Course("Java Programming", 6, 500.0);
        Course course2 = new Course("Web Development", 4, 400.0);
        
      //Display initial course details
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("Code Academy");

        // Display updated course details
        System.out.println("After Institute Name Update:\n");
        course1.displayCourseDetails();
        course2.displayCourseDetails();

	}

}
