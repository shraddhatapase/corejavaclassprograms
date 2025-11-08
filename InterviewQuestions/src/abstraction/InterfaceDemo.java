//Output:start bike
//start car
package abstraction;
public class InterfaceDemo {
	public static void main(String[] args) {
		vehicle obj = new Bike();
		vehicle obj1 = new Car();
		obj.start();
		obj1.start();

	}
}
interface vehicle {
	public void start();
}
class Bike implements vehicle {
	public void start() {
		System.out.println("start bike");
	}
}
class Car implements vehicle {
	public void start() {
		System.out.println("start car");
	}
}
