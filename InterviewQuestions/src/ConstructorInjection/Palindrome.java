package ConstructorInjection;



public class Palindrome {

	public static void main(String[] args) {
		
		String str="anna";
		
		boolean flag=true;
	
		StringBuffer sb=new StringBuffer(str);
		 System.out.println(sb.reverse().toString().equals(str));
	}

}
