package ConstructorInjection;

public class thisencapsulation {
	public static void main(String[] args) {
		Two_wheeler two = new Two_wheeler("Harley_Davidson");
	}
}

class Vehicle {
	String name;
	public Vehicle(String name) {
		this.name = name;
		System.out.println("value assigned in the super class:" + name);
	}
}

class Four_wheeler extends Vehicle {
	public Four_wheeler(String name) {
		super(name); // if we not declare this then it will give super clas  constructor undefined
		System.out.println("Four wheeler class:");
	}
}

class Three_wheeler extends Four_wheeler {
	public Three_wheeler(String name) {
		super(name);
		System.out.println("Three wheeler class:");
	}
}

class Two_wheeler extends Three_wheeler {
	public Two_wheeler(String name) {
		super(name.toUpperCase());
		// String str2=name.toUpperCase();
	}
}