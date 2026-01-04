package mock_questions;

import java.util.*;

public class Second {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(10, 20, 30, 50);
        List<Integer> list2 = Arrays.asList(50, 60, 60, 70);

        List<List<Integer>> two_d = Arrays.asList(list1, list2);

        int sum = two_d.stream()
                       .flatMap(List::stream) // flatten 2D list
                       .mapToInt(Integer::intValue)
                       .sum();

        System.out.println(sum);
    }
}
