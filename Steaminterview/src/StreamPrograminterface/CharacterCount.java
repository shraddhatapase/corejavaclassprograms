package StreamPrograminterface;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {

        String str = "programming";

        Map<Character, Long> charCount =
            str.chars()
               .mapToObj(c -> (char) c)
               .collect(Collectors.groupingBy(
                   Function.identity(),
                   LinkedHashMap::new,   // preserves insertion order
                   Collectors.counting()
               ));

        charCount.forEach((ch, count) ->
            System.out.println(ch + " : " + count)
        );
    }
}
//str.chars() → converts string to IntStream
//
//mapToObj() → converts int to Character
//
//groupingBy() → groups same characters
//
//Collectors.counting() → counts occurrences
//
//LinkedHashMap → keeps original order
