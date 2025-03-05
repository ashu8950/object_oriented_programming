package object_modeling.self_problem.school_student;
import java.util.ArrayList;

public class Student {
	private String studentName;
	private ArrayList<Course>courses;
	Student(String studentName){
		this.studentName = studentName;
		this.courses = new ArrayList<>();
	}
	
	//enroll course to the student
	
	void enrollCourse(Course course) {
		if(!courses.contains(course)) {
			courses.add(course);
			course.enrollStudent(this);
		}
	}
	
	//show the list of course 
	public ArrayList<String> showCourses(){
		ArrayList<String>courseNames = new ArrayList<>();
		for(Course course : courses) {
			courseNames.add(course.getName());
		}
		return courseNames;
	}
	
	//get the name of student
	
	String getName() {
		return studentName;
	}
	
}
