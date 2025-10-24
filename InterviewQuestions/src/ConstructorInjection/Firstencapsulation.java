//Atharva at = new Atharva();	✅ Works	Normal object creation
//Human human = new Atharva();	✅ Works	Upcasting (subclass → superclass)
//Atharva at = new Human();	❌ Error	Downcasting not allowed implicitly
//Output :pune 
package ConstructorInjection;

public class Firstencapsulation {

	public static void main(String[] args) {
		
		Atharva at=new Atharva();
		at.city();
		
		//Human human=new Atharva();
		
		//human.ci
		
		//Atharva at=new Human();
	

	}

}

class Human
{
	
	public void walk()
	{
		System.out.println("human is walking...");
	}
	
	public void laugh()
	{
		System.out.println("he is laughing");
	}
}

/**
 * IS-A relation.
 */
class Atharva extends Human
{
	public void city()
	{
		System.out.println("pune");
	}
	
}