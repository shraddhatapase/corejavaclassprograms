//Output:100
//100
//false
package ConstructorInjection;
import java.util.Objects;
public class HashcodeContract {
	public static void main(String[] args) {
		AeroplaneTest ae = new AeroplaneTest();
		ae.engine = 45.90;
		ae.name = "Boeing";
		ae.seats = 10;
		System.out.println(ae.hashCode());
		AeroplaneTest ae2 = new AeroplaneTest();
		ae2.engine = 45.90;
		ae2.name = "Bo";
		ae2.seats = 1;
		System.out.println(ae2.hashCode());
		System.out.println(ae.equals(ae2));
	}
}
class AeroplaneTest {
	static int counter = 1;
	public AeroplaneTest() {
		++counter;
	}
	String name;
	double engine;
	int seats;
	public int hashCode() {
		return 100;
	}
	public boolean equals(Object obj) {
		AeroplaneTest ae3 = (AeroplaneTest) obj;
		return (this.engine == ae3.engine && this.name.equals(ae3.name) && this.seats == ae3.seats);
	}
}