package core;

public class First {

	public static void main(String[] args) {
		
		double percentage=60;
		
		if(percentage>=35 && percentage <50)
		{
			System.out.println("you have passed the test.");
		}
		else if(percentage>=50 && percentage<60)
		{
			System.out.println("Second class.");
		}
		
		else if(percentage >=60 && percentage<70)
		{
			System.out.println("first class.");
		}
		else if(percentage>=70 && percentage<95)
		{
			System.out.println("distinction.");
		}
		else
		{
			System.out.println("hard luck !");
		}
		
		
	}

}
