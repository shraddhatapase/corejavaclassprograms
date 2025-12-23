package StreamPrograminterface;
import java.util.*;
import java.util.stream.Collectors;

class Person {
    private String name;
    private Integer age;     // Integer allows null
    private Double score;    // Double allows null

    public Person(String name, Integer age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() { return name; }
    public Integer getAge() { return age; }
    public Double getScore() { return score; }

    @Override
    public String toString() {
        return (name != null ? name : "null") +
               " (Age: " + (age != null ? age : "null") +
               ", Score: " + (score != null ? score : "null") + ")";
    }
}

public class MultiFieldSortExample {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
            new Person("Alice", 22, 85.5),
            new Person("Bob", 20, 90.0),
            new Person(null, 22, 92.0),          // null name
            new Person("David", null, 88.0),     // null age
            new Person("Eve", 22, null)          // null score
        );

        // Sort: age ascending, score descending, name ascending
        List<Person> sortedPeople = people.stream()
            .sorted(
                Comparator.comparing(Person::getAge, Comparator.nullsLast(Integer::compareTo)) // age ascending, nulls last
                          .thenComparing(Comparator.comparing(Person::getScore, Comparator.nullsLast(Double::compareTo)).reversed()) // score descending, nulls last
                          .thenComparing(Comparator.comparing(Person::getName, Comparator.nullsLast(String::compareTo))) // name ascending, nulls last
            )
            .collect(Collectors.toList());

        // Print sorted list
        sortedPeople.forEach(System.out::println);
    }
}
