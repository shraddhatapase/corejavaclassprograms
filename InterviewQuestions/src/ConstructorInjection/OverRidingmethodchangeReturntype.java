package ConstructorInjection;

public class OverRidingmethodchangeReturntype {
	public static void main(String[] args) {
		dog obj =new dog();
		obj.show();
	}
	}
class Animalto{
	protected void show() {
		System.out.println("show Animal");
	}
}
class dog extends Animalto{
	public void show() {
		System.out.println("show dog");
	}
}
