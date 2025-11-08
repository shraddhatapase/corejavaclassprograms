package abstraction;
public class Abstractclassobjectcreatesubclass {
	public static void main(String[] args) {
	animal obj= new dog();
	obj.display();
	}
}
abstract class animal{
	abstract void display();
	animal(){
		System.out.println("animal constructor");
	}
}
class dog extends animal{
	dog(){
		System.out.println("dog constructor");
	}
	void display() {
		System.out.println("display");
	};
}