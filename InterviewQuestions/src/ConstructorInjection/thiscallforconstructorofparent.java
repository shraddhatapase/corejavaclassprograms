//only one this should be in one constructor 
//this() is used to call constructor
//this Output:hello
//B
//C
package ConstructorInjection;
public class thiscallforconstructorofparent {
	public static void main(String[] args) {
		Indigo indigo = new Indigo();
		indigo.human_life();
	}
}
class Human_1 {
	public Human_1() {
		System.out.println("hello");
	}
	public void human_life() {

	}
}
class Aeroplane extends Human_1 {
	public Aeroplane() {
		System.out.println("A");
	}

	public Aeroplane(int i) {
		//this(); //if we not provide this then Aeroplane() constructor not executed
		System.out.println("B");
	}
}

class Indigo extends Aeroplane {
	public Indigo() {
		/**
		 * Such constructor of super class which is taking single int param
		 */
		super(12);
		System.out.println("C");
	}

}
