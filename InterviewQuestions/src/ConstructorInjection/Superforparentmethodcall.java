//calling parent class method in child class
//Output: parent constructor  method
//child class constructor  method
//this is parent method
//1000
//1000
package ConstructorInjection;
public class Superforparentmethodcall {
	public static void main(String[] args) {
	Subaccount obj=new Subaccount();
obj.display();
	}
}
class Account{
	int balance=1000;
	String name;
	public Account(String name) {
		this.setname(name);
		System.out.println("parent constructor  method");
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void checkbalance(){
		System.out.println("this is parent method");
	}
}
class Subaccount extends Account{
	int balance1=super.balance;
	public Subaccount() {		
	super("Shraddha");
	System.out.println("child class constructor  method");
	}
	public void display() {
		super.checkbalance();
		System.out.println(this.balance);
		System.out.println(this.balance1);
		
	}	
}
