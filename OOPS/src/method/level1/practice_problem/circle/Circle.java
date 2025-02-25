package method.level1.practice_problem.circle;

public class Circle {
	private double radius;
	private Circle() {
		// TODO Auto-generated constructor stub
		this(2.0);
	}
	private Circle(double r) {
		this.radius = r;
	}
	
	private double getArea() {
		return Math.PI *radius*radius;
	}
	private void display() {
		System.out.println("Area of a Circle is :"+String.format(".%2f", getArea())+"cm");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		circle.display();

	}

}
