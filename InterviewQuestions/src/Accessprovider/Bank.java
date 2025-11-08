//Output:
//name is: SBIPublic
//******************
//with the inheritance. in diff. package., in diff. class
//pincode 434343  Protected
//name is: SBIPublic


package Accessprovider;

public class Bank {

	public void display()
	{
		System.out.println("name is: SBI"+"Public");
	}
	
	protected void pincode()
	{
		System.out.println("pincode 434343"+"  Protected");
	}
	
	void branchmanager()
	{
		System.out.println("Alex wails"+"   default");
	}
	
	private void totalcash()
	{
		System.out.println("123.56 lakhs"+"  Private");
	}
	public void demo() {
		/**
		 * Everything is accessible in the 
		 * same class.
		 */
	display();
	pincode();
	branchmanager();
	totalcash();
	}
}
class Test32 extends Bank{
	void dislpay2(){
		System.out.println("shraddha");
		pincode();
		super.pincode();
		display();
		pincode();
		branchmanager();
		//totalcash(); only totalcash private method is not accessible
	}
	
	
}