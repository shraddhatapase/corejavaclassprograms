package StreamPrograminterface;

import java.util.*;

public class Startwithno {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("1apple", "banana", "2orange", "apple3", "9grapes", "carrot");
		list.stream().filter(s -> !s.isEmpty() && Character.isDigit(s.charAt(0))).forEach(System.out::println);
	}
}
