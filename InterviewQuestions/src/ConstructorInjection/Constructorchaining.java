//this() → used for constructor jumping within the same class.//
//super() → used for constructor jumping to the parent class.//
//The compiler always adds an implicit super() if you don’t write one.//
//The first statement in any constructor must be either this() or super() — never both.
//Output:Creating first student object:
//Constructor of Person with name: Shraddha
//Constructor of Student with name and age called
//Name: Shraddha, Age: 20
//Default constructor of Student called
//
//Creating second student object:
//Constructor of Person with name: Aarav
//Constructor of Student with name and age called
//Name: Aarav, Age: 22
package ConstructorInjection;
class Person {
    // Parent class constructor 1
    Person() {
        this("Unknown");
        System.out.println("Default constructor of Person called");
    }
    // Parent class constructor 2
    Person(String name) {
        System.out.println("Constructor of Person with name: " + name);
    }
}
class Student extends Person {
    // Child class constructor 1
    Student() {
        this("Shraddha", 20);  // Jumping to another constructor in same class
        System.out.println("Default constructor of Student called");
    }
    // Child class constructor 2
    Student(String name, int age) {
        super(name);  // Jumping to parent class constructor
        System.out.println("Constructor of Student with name and age called");
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Constructorchaining {
    public static void main(String[] args) {
        System.out.println("Creating first student object:");
        Student s1 = new Student();
        System.out.println("\nCreating second student object:");
        Student s2 = new Student("Aarav", 22);
    }
}