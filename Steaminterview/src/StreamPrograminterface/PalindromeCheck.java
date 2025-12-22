package StreamPrograminterface;

import java.util.stream.IntStream;

public class PalindromeCheck {
	public static void main(String[] args) {
		String str = "radar";
		boolean isPalindrome = IntStream.range(0, str.length() / 2)
				.allMatch(i -> str.charAt(i) == str.charAt(str.length() - 1 - i));

		System.out.println(str + " is palindrome? " + isPalindrome);
	}
}
//Step 1️⃣: IntStream.range(0, str.length() / 2)
//IntStream.range(0, str.length() / 2)
//Creates a stream of indices from 0 to str.length()/2 - 1
//We only need to check first half of the string, because palindrome is symmetric.
//Example: "radar" → length = 5 → indices = 0, 1
//Step 2️⃣: .allMatch(...)
//.allMatch(i -> ...)
//Checks if the given condition is true for all elements in the stream.
//Returns true if all indices satisfy the condition, otherwise false.