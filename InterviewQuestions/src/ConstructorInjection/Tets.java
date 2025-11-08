package ConstructorInjection;
//package ExceptionHandling;
//import ExceptionHandling.InvalidAgeRuntimeException;

class Tets{


	public static void main(String[] args) {
		calculate obj= new calculate();
		System.out.println(obj.hashCode());
		calculate obj2=new calculate();		
		System.out.println(obj2.hashCode());
		
		

	}
}
class calculate{

}