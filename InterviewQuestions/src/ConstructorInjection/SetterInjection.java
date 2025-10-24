//dependancies provided using setter method
package ConstructorInjection;

public class SetterInjection {
	public static void main(String[] args) {
		Game obj= new Game();
		obj.setName("cricket");
		System.out.println(obj.getName());
	}
}
class Game{
	String name;
	public String getName() {
		return name;
		
	}
	public void setName(String name){
		this.name=name;
		
	}
	
}
