//Abstraction in Java is the process of hiding implementation details and showing only the essential features of an object.
//Output:Dog barks
//This animal eats food
package abstraction;

public class Abstract {
	public static void main(String[] args) {
		Animal obj = new Dog();
		obj.makeSound(); // Output: Dog barks
		obj.eat(); // Output: This animal eats food
	}
}

abstract class Animal {
	// Abstract method (no body)
	abstract void makeSound();

	// Concrete method (has body)
	void eat() {
		System.out.println("This animal eats food");
	}
}

class Dog extends Animal {
	// Providing implementation of abstract method
	void makeSound() {
		System.out.println("Dog barks");
	}
}
