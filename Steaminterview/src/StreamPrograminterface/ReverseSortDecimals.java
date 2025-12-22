package StreamPrograminterface;
import java.util.*;
public class ReverseSortDecimals {
	public static void main(String[] args) {
		List<Double> list = Arrays.asList(2.5, 1.2, 4.8, 3.1, 0.9);
		 list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}