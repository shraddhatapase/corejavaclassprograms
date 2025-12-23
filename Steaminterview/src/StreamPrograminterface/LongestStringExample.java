package StreamPrograminterface;

import java.util.*;

public class LongestStringExample {
	public static void main(String[] args) {

		List<String> strings = Arrays.asList("Java", "Streams", "Programming", "API", "Lambda");

		// Find the longest string
		String longest = strings.stream().max(Comparator.comparingInt(String::length)).orElse(null); // handles empty
																										// list

		System.out.println("Longest string: " + longest);
	}
}
//strings.stream() → creates a stream from the list.
//
//Comparator.comparingInt(String::length) → compares strings by their length.
//
//max() → returns the string with the maximum length.
//
//orElse(null) → ensures that an empty list doesn’t throw an exception.