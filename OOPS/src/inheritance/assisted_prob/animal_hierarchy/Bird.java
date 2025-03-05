package inheritance.assisted_prob.animal_hierarchy;

public class Bird extends Animal{
	Bird(String name,int age){
		super(name,age);
	}
	
	@Override
	 void makeSound() {
		System.out.println(super.getName()+" chi chi");
	}
}
