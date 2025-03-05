package inheritance.multilevel_inheritance.educational;

public class Course {
	protected String courseName;
    protected int duration; // Duration in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}
