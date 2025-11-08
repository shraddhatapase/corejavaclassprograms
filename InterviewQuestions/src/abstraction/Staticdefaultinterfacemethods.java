//Output:internet Credicard method
//Payment using Creditcard230
//----------------
//Payment using Paytm500
//INR,USD are available currency
//internet connection is working
//----------------
//INR,USD are available currency
//Example of static and default method in interface

package abstraction;
public class Staticdefaultinterfacemethods {
	public static void main(String[] args) {
		PaymentGateway obj = new Paytm();
		PaymentGateway obj1 = new Creditcard();
		obj1.pay(230);
		System.out.println("----------------");
		obj.pay(500);
		Paytm.Currency();
		obj.Internetconection();
		System.out.println("----------------");
		PaymentGateway.Currency();
	}
}

interface PaymentGateway {
	void pay(int Amount);
	default void Internetconection() {
		System.out.println("internet connection is working");
	}
	static void Currency() {
		System.out.println("INR,USD are available currency");
	}
}
interface I_plantt {
	// void breathe();
	default void Internetconection() {
		System.out.println("internet connection is working");
	}
}
class Paytm implements PaymentGateway, I_plantt {
	public void pay(int Amount) {
		System.out.println("Payment using Paytm" + Amount);
		PaymentGateway.Currency();
	}
	public void Internetconection() {
		PaymentGateway.super.Internetconection();
	}
	static void Currency() {
		System.out.println("Paytm currency");
	}
}
class Creditcard implements PaymentGateway {
	public void pay(int Amount) {
		Internetconection();
		System.out.println("Payment using Creditcard" + Amount);
	}
	public void Internetconection() {
		System.out.println("internet Credicard method");
	}
}