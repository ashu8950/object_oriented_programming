package inheritance.assisted_prob.animal_hierarchy;

public class AnimalHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        Animal bird = new Bird("Tweety", 1);
        
        
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
	}

}
