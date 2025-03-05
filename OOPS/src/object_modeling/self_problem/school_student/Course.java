package object_modeling.self_problem.school_student;
import java.util.ArrayList;

public class Course {
	private String courseName;
	private ArrayList<Student>students;
	Course(String courseName){
		this.courseName = courseName;
		this.students = new ArrayList<>();
	}
	
	//enrolling student to the course
	void enrollStudent(Student student) {
		if(!students.contains(student)) {
			students.add(student);
			student.enrollCourse(this); //bidirectional asssociation
		}
	}
	
	//show student that enroll with the course
	
	public ArrayList<String> showStudent(){
		ArrayList<String>studentNames = new ArrayList<>();
		for(Student student : students) {
			studentNames.add(student.getName());
		}
		return studentNames;
	}
	
	//to get the name of course
	String getName() {
		return courseName;
	}
	
}
