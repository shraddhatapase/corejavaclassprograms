package StreamPrograminterface;
import java.util.*;
import java.util.stream.IntStream;
public class Primeno {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 6, 8, 9, 11, 12);
		//list.stream().filter(Primeno::isPrime).forEach(System.out::println);
		list.stream()
	    .peek(n -> System.out.println("Checking: " + n))
	    .filter(Primeno::isPrime)
	    .peek(n -> System.out.println("Prime found: " + n))
	    .forEach(System.out::println);

	}
	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		return IntStream.rangeClosed(2, (int) Math.sqrt(n)).allMatch(i -> n % i != 0);
	}
}
//rangeClosed(2, √n) generates possible divisors and allMatch() ensures none divide n.