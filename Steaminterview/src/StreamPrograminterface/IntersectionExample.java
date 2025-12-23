package StreamPrograminterface;

import java.util.*;

public class IntersectionExample {
	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

		List<Integer> intersection = list1.stream().filter(list2::contains).toList(); // Java 16+

		System.out.println(intersection);
	}
}
