package object_modeling.self_problem.university_management;
import java.util.List;
import java.util.ArrayList;

public class Professor {
	private String name;
    private List<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void teachCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this);
    }

    public String getName() {
        return name;
    }
}
