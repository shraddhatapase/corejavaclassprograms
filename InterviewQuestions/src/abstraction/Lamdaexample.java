//(parameter list) -> { method body }
//Output:Add: 15
//Multiply: 50
package abstraction;
public class Lamdaexample {
	public static void main(String[] args) {
		// Addition
		Operation add = (a, b) -> a + b;

		// Multiplication
		Operation multiply = (a, b) -> a * b;

		System.out.println("Add: " + add.calculate(10, 5));
		System.out.println("Multiply: " + multiply.calculate(10, 5));
	}
}
interface Operation {
	int calculate(int a, int b);
}