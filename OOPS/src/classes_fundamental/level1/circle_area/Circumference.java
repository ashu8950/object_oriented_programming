package classes_fundamental.level1.circle_area;

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
