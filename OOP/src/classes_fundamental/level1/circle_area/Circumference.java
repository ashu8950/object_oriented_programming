package classes_and_fundamental.level1_problem.area_of_circle;

public class Circumference {
	double circumference;
	public double circumferenceOfCircle(double radius) {
		circumference = 2 * 3.14 * radius;
		return circumference;
	}
	void display() {
		System.out.println("Circumference of a circle is : "+ circumference);
	}
}
