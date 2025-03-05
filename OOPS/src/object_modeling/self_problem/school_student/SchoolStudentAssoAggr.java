package object_modeling.self_problem.school_student;

public class SchoolStudentAssoAggr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School school = new School("Greenwood High");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        // Add students to the school (Aggregation)
        school.addStudent(student1);
        school.addStudent(student2);

        // Enroll students in courses (Association)
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Display enrolled courses for a student
        System.out.println("Courses for " + student1.getName() + ": " + student1.showCourses()); // ['Math', 'Science']

        // Display students in a course
        System.out.println("Students in " + course1.getName() + ": " + course1.showStudent()); // ['Alice', 'Bob']

        // Show all students in the school
        System.out.println("Students in " + school.getName() + ": " + school.showStudent()); // ['Alice', 'Bob']

	}

}
