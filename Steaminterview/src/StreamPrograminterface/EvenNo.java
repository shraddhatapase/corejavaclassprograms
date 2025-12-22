package StreamPrograminterface;
import java.util.Arrays;
import java.util.List;
public class EvenNo {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		list.stream().filter(n -> n % 2 == 0) // keep only even numbers
				.forEach(System.out::println);
	}
}
