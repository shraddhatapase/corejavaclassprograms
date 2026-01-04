package StreamPrograminterface;
import java.util.*;
public class StartWithOne {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 21, 12,null,null, 31, 100, 45, 1);

		list.stream().filter(n -> String.valueOf(n).startsWith("1")).forEach(System.out::println);
	}
}
