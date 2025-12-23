package StreamPrograminterface;

import java.util.*;

public class FirstOddNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 4, 6, 7, 9, 10);

        Integer firstOdd =
            list.stream()
                .filter(n -> n % 2 != 0)
                .findFirst()
                .orElse(null);   // handles case when no odd number exists

        System.out.println(firstOdd);
    }
}

