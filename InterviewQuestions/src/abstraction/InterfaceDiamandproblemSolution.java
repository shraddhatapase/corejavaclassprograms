package abstraction;

public class InterfaceDiamandproblemSolution {
	public static void main(String[] args) {
		C obj=new  C();
		obj.show();
		//new C().show();
	}
}
interface A {
	default void show() {
		System.out.println("A's show()");
	}
}
interface B {
	default void show() {
		System.out.println("B's show()");
	}
}
class C implements A, B {
	@Override
	public void show() {
		A.super.show(); // call A's version
		B.super.show(); // call B's version
		System.out.println("C's own show()");
	}
}