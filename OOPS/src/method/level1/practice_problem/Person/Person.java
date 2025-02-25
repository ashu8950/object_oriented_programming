package method.level1.practice_problem.Person;

public class Person {
	private String name;
	//default constructor;
	private Person() {
		// TODO Auto-generated constructor stub
		this.name = "Ashu";
		
	}
	//copy constructor
	private Person(Person other) {
		this.name = other.name;
	}
	
	private void display() {
		System.out.println("Name of a Person is : "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//default constructor 
		Person person = new Person();
		person.display(); 
		
		System.out.println();
		//copy constructor
		Person person1 = new Person(person);
		person1.display();

	}

}
