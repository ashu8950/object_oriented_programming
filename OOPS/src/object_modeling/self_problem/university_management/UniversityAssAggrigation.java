package object_modeling.self_problem.university_management;

public class UniversityAssAggrigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Professor professor1 = new Professor("Dr. Smith");

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Physics");

        professor1.teachCourse(course1);
        professor1.teachCourse(course2);

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        course1.showCourseDetails();
        course2.showCourseDetails();

	}

}
