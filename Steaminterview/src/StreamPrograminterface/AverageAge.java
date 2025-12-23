package StreamPrograminterface;

import java.util.*;
import java.util.stream.*;

class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return name + " (Age: " + age + ")";
	}
}

public class AverageAge {
	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student("Alice", 20), new Student("Bob", 22),
				new Student("Charlie", 24), new Student("David", 21));

		double averageAge = students.stream().mapToInt(Student::getAge).average().orElse(0); // handles empty list

		System.out.println("Average age: " + averageAge);
	}
}
