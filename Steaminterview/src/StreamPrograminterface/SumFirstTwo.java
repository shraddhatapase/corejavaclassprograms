package StreamPrograminterface;

import java.util.*;

public class SumFirstTwo {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 90, 30, 40);

		int sum = list.stream().limit(2) // take first two elements
				.mapToInt(Integer::intValue).sum();

		System.out.println(sum);
	}
}
//limit(2) → selects the first two elements
//
//mapToInt() → converts Integer to int