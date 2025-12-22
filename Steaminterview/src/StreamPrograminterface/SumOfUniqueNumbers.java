package StreamPrograminterface;

import java.util.*;

public class SumOfUniqueNumbers {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 5);

		int sum = list.stream().distinct() // remove duplicates
				.mapToInt(Integer::intValue).sum();

		System.out.println(sum);
	}
}
