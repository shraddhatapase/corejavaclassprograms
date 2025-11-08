package ConstructorTest;
//in this program constructor alway execute first
public class ConstructorPro {
	public static void main(String[] args) {				
		      Matrix shraddha =new Matrix("Pune");		     
		      shraddha.printcity();
		      System.out.println("*********************");		      
		      Matrix aaradhya=new Matrix("Mumbai");
		       aaradhya.printcity();
			}
		}
		class Matrix
		{
			String city; 
			public Matrix(String city_name)
			{ 
				this.city=city_name;
				System.out.println("Object created");			
			}
			
			public void printcity()
			{
				System.out.println(this.city);//Pune ?? Mumbai
			}			
		}

	


