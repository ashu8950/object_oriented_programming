package inheritance.assisted_prob.animal_hierarchy;

abstract class Animal {
	private String name;
	private int age;
	
	Animal(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public static void display() {
		System.out.println("Hello Wold");
	}
	
	abstract void makeSound();
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
