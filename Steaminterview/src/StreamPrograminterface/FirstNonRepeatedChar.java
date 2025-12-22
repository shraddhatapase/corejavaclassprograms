package StreamPrograminterface;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {

        String str = "swiss";

        Character result =
            str.chars()
               .mapToObj(c -> (char) c)
               .collect(Collectors.groupingBy(
                   Function.identity(),
                   LinkedHashMap::new,      // preserves insertion order
                   Collectors.counting()
               ))
               .entrySet()
               .stream()
               .filter(e -> e.getValue() == 1)
               .map(Map.Entry::getKey)
               .findFirst()
               .orElse(null);

        System.out.println(result);
    }
}

//str.chars() → converts string to IntStream
//
//mapToObj() → converts int to Character
//
//groupingBy() → counts occurrences
//
//LinkedHashMap keeps original order
//
//Filter characters with count 1
//
//findFirst() → gets the first non-repeated character