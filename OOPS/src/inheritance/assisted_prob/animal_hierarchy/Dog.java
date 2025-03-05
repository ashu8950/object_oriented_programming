package inheritance.assisted_prob.animal_hierarchy;

public class Dog extends Animal {
	Dog(String name,int age) {
		super(name,age);
	}
	@Override
	void makeSound() {
		System.out.println(super.getName()+" bark's");
	}

}
