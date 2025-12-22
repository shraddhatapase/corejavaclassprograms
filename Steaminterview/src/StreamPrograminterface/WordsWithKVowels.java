package StreamPrograminterface;

import java.util.*;
import java.util.stream.*;

public class WordsWithKVowels {
	public static void main(String[] args) {

		String sentence = "This is a simple stream example";
		int k = 2;

		List<String> result = Arrays.stream(sentence.split("\\s+")).filter(word -> countVowels(word) == k).toList(); // Java
																														// 16+

		System.out.println(result);
	}

	static long countVowels(String word) {
		return word.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
	}
}
//sentence.split("\\s+") → splits sentence into words
//
//filter(word -> countVowels(word) == k) → keeps words with exactly k vowels
//
//chars() → converts string to IntStream
//
//"aeiou".indexOf(c) != -1 → checks if character is a vowel
//
//count() → counts vowels in the word