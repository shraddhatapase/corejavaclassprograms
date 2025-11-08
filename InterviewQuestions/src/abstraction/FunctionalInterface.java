//A Functional Interface in Java 8 is an interface with exactly one abstract method, used as the target type for lambda expressions and method references 
//Output:30
package abstraction;

public class FunctionalInterface {
	public static void main(String[] args) {
		functionaldemo obj= new functionaldemo();
		obj.add(10,20);
	}
}
interface functional{
	abstract int add(int a,int b);
}
class functionaldemo{
	public void add(int a ,int b) {
		System.out.println(a+b);		
	}
}