package abstraction;

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ipay obj= new Gpay();
System.out.println(obj.Receive("1234",300));
	}

}
interface Ipay{
	String Send(String ac_no,double amount);
	String Receive(String no,double amount);
}
class Gpay implements Ipay{
	public String Send(String ac_no,double amount) {
		return "Gpay"+amount+"ac_no"+ac_no+" ";
	}
	public String Receive(String no,double amount) {
		return "money"+amount+"ac_no"+no;
	}
	
} 
