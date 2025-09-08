package TestString;

public class ReverseNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("welcome");
		String rever = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rever = rever + str.charAt(i);			
		}
		System.out.println(rever);
	}
}
