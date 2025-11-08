package Interfacepackage;

public class Functionalinterfacedemo1 {
	
	    public static void main(String[] args) {
	        MyFunctionalInterface obj = () -> System.out.println("Hello, Functional Interface!");
	        obj.sayHello();   // Calls lambda
	        obj.greet();      // Calls default method
	        MyFunctionalInterface.info(); // Calls static method
	    }
	

}
@FunctionalInterface
interface MyFunctionalInterface {
    void sayHello(); // Only one abstract method

    // You can still have default or static methods
    default void greet() {
        System.out.println("Hello from default method!");
    }

    static void info() {
        System.out.println("This is a static method in a functional interface.");
    }
}
