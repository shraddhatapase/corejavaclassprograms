package StreamPrograminterface;

import java.util.Arrays;

public class LastElement {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };

		int lastElement = Arrays.stream(arr).reduce((first, second) -> second)
				.orElseThrow(() -> new IllegalStateException("Array is empty"));

		System.out.println(lastElement);
	}
}
//reduce((first, second) -> second)
//→ keeps replacing the value with the next element
//→ final value is the last element
