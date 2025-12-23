package StreamPrograminterface;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private int age;

	public Employee(int id, String name, int age) {
		this.id = id;
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

public class GroupByAgeExample {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(1, "Rahul", 25), new Employee(2, "Sneha", 30),
				new Employee(3, "Amit", 25), new Employee(4, "Neha", 30), new Employee(5, "Pooja", 35));

		Map<Integer, List<Employee>> employeesByAge = employees.stream()
				.collect(Collectors.groupingBy(Employee::getAge));

		employeesByAge.forEach((age, empList) -> {
			System.out.println("Age " + age + " : " + empList);
		});
	}
}
//groupingBy(Employee::getAge) → groups employees by age
//
//Result type → Map<Integer, List<Employee>>
//
//Each key = age, value = list of employees with that age
