package ArrayList;

import java.util.*;

public class ListDeleteComparison {
	public static void main(String[] args) {
		int size = 100000; // number of elements

		List<Student> arrayList = new ArrayList<>();
		List<Student> linkedList = new LinkedList<>();

		// Fill both lists with Student objects
		for (int i = 0; i < size; i++) {			
			arrayList.add(new Student(i, "Student" + i, 20 + (i % 5), 75.5));
			linkedList.add(new Student(i, "Student" + i, 20 + (i % 5), 75.5));
		}

		// --- Measure deletion from middle ---

		// ArrayList delete
		long startArray = System.nanoTime();
		arrayList.remove(size / 2);
		long endArray = System.nanoTime();

		// LinkedList delete
		long startLinked = System.nanoTime();
		linkedList.remove(size / 2);
		long endLinked = System.nanoTime();

		System.out.println("ArrayList deletion time: " + (endArray - startArray) + " ns");
		System.out.println("LinkedList deletion time: " + (endLinked - startLinked) + " ns");
	}
}
class Student {
    int id;
    String name;
    int age;
    double marks;

    Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}

