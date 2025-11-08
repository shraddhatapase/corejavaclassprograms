package TestFun;

public class FunctionDemocal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj= new Calculator();
		int result = obj.addition(10, 20);
        System.out.println("Sum = " + result);
        int result1 = obj.substaction(10, 20);
        System.out.println("substaction = " + result1);
    		int result2 = obj.multiplication(10, 20);
        System.out.println("multiplication= " + result2);
    		int result3 = obj.division(100, 20);
        System.out.println("division = " + result3);
	}
}
class Calculator {
	public int addition(int a,int b) {
		return a+b;
	}
	public int substaction(int a,int b) {		
		return a-b;
	}
	public int multiplication(int a,int b) {
		return a*b;
	}
	public int division(int a,int b) {	
		return a/b;
	}
}

