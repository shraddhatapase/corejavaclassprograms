package abstraction;
public class ObjectExample {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Shraddha");
		Student s2 = new Student(101, "Shraddha");
		System.out.println(s1); // calls toString()
		System.out.println(s1.equals(s2)); // calls overridden equals()
	}
}
class Student {
	int id;
	String name;
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	// Override toString()
//	public String toString() {
//		return id + " - " + name;
//	}
	// Override equals()
	public boolean equals(Object obj) {
		System.out.println(obj.getClass());
		System.out.println(obj.getClass());
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Student s = (Student) obj;
		return id == s.id && name.equals(s.name);
	}
}
