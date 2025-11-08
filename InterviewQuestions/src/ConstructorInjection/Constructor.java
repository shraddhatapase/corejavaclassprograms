package ConstructorInjection;
class Constructor {
	public static void main(String[] args) {
		// This would invoke the parameterized constructor
		Geeks geek1 = new Geeks("Sweta", 68);
		System.out.println("GeekName: " + geek1.name + " and GeekId: " + geek1.id);
	}
}
class Geeks {
	// data members of the class
	String name;
	int id;

	Geeks(String name, int id) {
		//Scanner 
		this.name = name;
		this.id = id;
	}
}
	