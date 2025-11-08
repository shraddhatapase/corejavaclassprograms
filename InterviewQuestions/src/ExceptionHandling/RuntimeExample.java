//Creating Custom Runtime (Unchecked) Exception
package ExceptionHandling;
//Step 2: Use it without declaring 'throws'
public class RuntimeExample {
	static void validateAge(int age) {
		if (age < 18) {
			throw new InvalidAgeRuntimeException("Age must be 18 or above!");
		}
		System.out.println("Valid age: " + age);
	}

	public static void main(String[] args) {
		validateAge(15); // No try-catch, will crash at runtime
		System.out.println("Program continues...");
	}
}
// Step 1: Create custom runtime exception
class InvalidAgeRuntimeException extends RuntimeException {
	InvalidAgeRuntimeException(String message) {
		super(message);
	}
}


