package ExceptionHandling;
public class CheckedExample {
	static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above!");
		}
		System.out.println("Valid age: " + age);
	}
	public static void main(String[] args) {
		try {
			validateAge(15);
		} catch (InvalidAgeException e) {
			System.out.println("Caught exception: " + e.getMessage());
		}
	}
}
//Step 1: Create custom checked exception
class InvalidAgeException extends Exception {
	InvalidAgeException(String message) {
		super(message);
	}
}

//Step 2: Throw it from a method
