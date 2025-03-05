package object_modeling.self_problem.university_management;
import java.util.List;
import java.util.ArrayList;

public class Student {
	private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public String getName() {
        return name;
    }
}
