package terminal_ops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Second {

	public static void main(String[] args) {
		
		 Supplier<List<Integer>> list=ArrayList::new;
		 
		 
		 IgetString<Student> ig=Student::new;
		 
		 System.out.println(ig.getStringObject(new Student(),new Student()));
		 
		 
		 


	}

}

interface IgetString<T>
{
	T  getStringObject(T t1, T t2);
}
class Student
{
	int id;
	String name;
	// Constructor that takes two Student objects
    Student(Student s1, Student s2) {
        this.id = s1.id + s2.id;       // example logic
        this.name = s1.name + s2.name; // example logic
    }
    Student() {
        this.id = id;       // example logic
        this.name = name; // example logic
    }
    @Override
    public String toString() {
        return "Student{id=" + id + ", name=" + name + "}";
    }
}