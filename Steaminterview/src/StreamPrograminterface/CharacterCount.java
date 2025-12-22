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
//p : 1
//r : 2
//o : 1
//g : 2
//a : 1
//m : 2
//i : 1
//n : 1
