package inheritance.multilevel_inheritance.educational;

public class CourseManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course = new Course("Introduction to Java", 6);
        OnlineCourse onlineCourse = new OnlineCourse("Web Development", 8, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Data Science", 12, "Coursera", false, 499.99, 20);

        course.displayCourseDetails();
        System.out.println();
        onlineCourse.displayCourseDetails();
        System.out.println();
        paidCourse.displayCourseDetails();
	}

}
