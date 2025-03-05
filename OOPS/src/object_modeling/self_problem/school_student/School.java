package object_modeling.self_problem.school_student;
import java.util.ArrayList;

public class School {
	private String schoolName;
	private ArrayList<Student>students;
	School(String schoolName){
		this.schoolName = schoolName;
		this.students = new ArrayList<>();
	}
	
	//add student to the school
	 void addStudent(Student student) {
		 if(!students.contains(student)) {
			 students.add(student);
		 }
	 }
	 
	 //show the list of student
	 
	 public ArrayList<String> showStudent(){
		 ArrayList<String>studentName = new ArrayList<>();
		 for(Student student : students) {
			 studentName.add(student.getName());
		 }
		 return studentName;
	 }
	 
	 //get the name of school
	  String getName() {
		  return schoolName;
	  }
}
