package StreamPrograminterface;

import java.util.*;
import java.util.stream.*;

public class NthSmallest {
	public static void main(String[] args) {

		int[] arr = { 7, 2, 1, 6, 4, 3 };
		int n = 3; // find 3rd smallest element

		int nthSmallest = Arrays.stream(arr).sorted().skip(n - 1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("n is out of range"));

		System.out.println(n + "rd smallest element is: " + nthSmallest);
	}
}
//Arrays.stream(arr) → creates an IntStream
//
//sorted() → sorts elements in ascending order
//
//skip(n - 1) → skips the first n-1 smallest elements
//
//findFirst() → gets the nth element
//
//orElseThrow() → handles invalid n