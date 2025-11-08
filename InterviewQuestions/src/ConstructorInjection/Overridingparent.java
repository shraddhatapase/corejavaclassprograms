package ConstructorInjection;

public class Overridingparent {
	public static void main(String[] args) {
		overB obj = new overB();
		obj.display(5);
	}
}

class overA {
	void display(int x) {
		System.out.println("Class A");
	}
}

class overB extends overA {
	void display(double x) { // Different parameter → NOT overriding
		System.out.println("Class B");
	}
}
