package StreamPrograminterface;
import java.util.*;
import java.util.stream.*;
public class MergeTwostream {
	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

		List<Integer> result = Stream.concat(list1.stream(), list2.stream()).distinct().toList(); // Java 16+

		System.out.println(result);
	}
}
