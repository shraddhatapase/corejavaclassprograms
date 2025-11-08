package Accessprovider;

	// File: ReturnTypeDemo.java
	class Animal {}
	class Dog extends Animal {} // Subclass for covariant example

	class ReturnTypeDemo {

	    // 1️⃣ Primitive return type
	    int primitiveMethod() {
	        System.out.println("Parent: primitiveMethod()");
	        return 10;
	    }

	    // 2️⃣ void return type
	    void voidMethod() {
	        System.out.println("Parent: voidMethod()");
	    }

	    // 3️⃣ String return type (final class)
	    String stringMethod() {
	        System.out.println("Parent: stringMethod()");
	        return "Parent String";
	    }

	    // 4️⃣ Object return type (can be covariant)
	    Animal objectMethod() {
	        System.out.println("Parent: objectMethod()");
	        return new Animal();
	    }
	}

	class Child extends ReturnTypeDemo {

	    // ❌ 1️⃣ Cannot change primitive return type
	    // double primitiveMethod() {
	    //     System.out.println("Child: primitiveMethod()");
	    //     return 10.5;
	    // }

	    // ❌ 2️⃣ Cannot change void to return value
	    // int voidMethod() {
	    //     System.out.println("Child: voidMethod()");
	    //     return 1;
	    // }

	    // ❌ 3️⃣ Cannot change String to Object
	    // Object stringMethod() {
	    //     System.out.println("Child: stringMethod()");
	    //     return "Child Object";
	    // }

	    // ✅ 4️⃣ Covariant return type allowed
	    Dog objectMethod() {
	        System.out.println("Child: objectMethod()");
	        return new Dog();
	    }
	}

	public class OverridingReturnTypeChange {
	    public static void main(String[] args) {
	    	ReturnTypeDemo p = new Child();
	        System.out.println("\n--- Demonstrating Covariant Return ---");
	        p.objectMethod();
	    }
	}

