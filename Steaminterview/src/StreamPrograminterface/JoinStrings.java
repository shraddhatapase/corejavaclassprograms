package StreamPrograminterface;

import java.util.*;
import java.util.stream.Collectors;

public class JoinStrings {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("A", "B", "C");

		String result = list.stream().collect(Collectors.joining(", ", // delimiter
				"[", // prefix
				"]" // suffix
		));

		System.out.println(result);
	}
}
//Collectors.joining(delimiter, prefix, suffix)
//delimiter → placed between elements → ,
//
//prefix → added at the beginning → [
//
//suffix → added at the end → ]
