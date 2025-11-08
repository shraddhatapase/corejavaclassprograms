package ConstructorTest;

public class ConstructorInjectionExample {

	public static void main(String[] args) {	
        StudentInfo student = new StudentInfo(101, "Rahul Sharma", 22, "Computer Science", 'A');  
      
        System.out.println("ID     : " + student.getId());
        System.out.println("Name   : " + student.getName());
        System.out.println("Age    : " + student.getAge());
        System.out.println("Course : " + student.getCourse());
        System.out.println("Grade  : " + student.getGrade());

	}
}
class StudentInfo {
    private int id;
    private String name;
    private int age;
    private String course;
    private char grade; 
    public StudentInfo(int id, String name, int age, String course, char grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }
 
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCourse() {
        return course;
    }
    public char getGrade() {
        return grade;
    }
}
