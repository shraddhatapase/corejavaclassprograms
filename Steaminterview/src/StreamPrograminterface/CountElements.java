package StreamPrograminterface;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountElements {
	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

		// Count occurrences of each word
		Map<String, Long> wordCount = words.stream().collect(Collectors.groupingBy(Function.identity(), // use element
																										// itself as key
				Collectors.counting() // count occurrences
		));

		// Print the counts
		wordCount.forEach((word, count) -> System.out.println(word + " : " + count));
	}
}
