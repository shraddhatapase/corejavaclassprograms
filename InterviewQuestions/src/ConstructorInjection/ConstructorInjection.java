//use constructor to set instance variable is called constructor injection
package ConstructorInjection;

public class ConstructorInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CI obj=new CI("Pune");
		obj.display();

	}

}
class CI{
	String city;
	public CI(String city) {
		this.city=city;
		System.out.println("this is city "+city);
		
	}
	public void display() {
		System.out.println(city);
		
		
	}
}
