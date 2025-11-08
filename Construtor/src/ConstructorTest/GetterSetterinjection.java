package ConstructorTest;

public class GetterSetterinjection {

	public static void main(String[] args) {
		Student student = new Student();
  
        student.setId(101);
        student.setName("Rahul Sharma");
        student.setAge(22);
        student.setCourse("Computer Science");
        student.setGrade('A');
     
        System.out.println("*********************");
        System.out.println("ID     : " + student.getId());
        System.out.println("Name   : " + student.getName());
        System.out.println("Age    : " + student.getAge());
        System.out.println("Course : " + student.getCourse());
        System.out.println("Grade  : " + student.getGrade());
	}
}
	class Student {
	    private int id;
	    private String name;
	    private int age;
	    private String course;
	    private char grade;

	    public void setId(int id) {
	        this.id = id;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }
	    public void setCourse(String course) {
	        this.course = course;
	    }
	    public void setGrade(char grade) {
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


