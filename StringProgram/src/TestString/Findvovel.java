package TestString;

public class Findvovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= new String("Indiaisbestcountry");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i'||
					str.charAt(i) == 'o'||str.charAt(i) == 'u') {
				System.out.println(i);
			}
			
		}
	}

}
