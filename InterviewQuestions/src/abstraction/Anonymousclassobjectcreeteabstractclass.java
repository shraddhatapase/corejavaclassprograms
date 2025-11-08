//Anonymous class creation
//Output:Shital
//hello:::12342
package abstraction;

public class Anonymousclassobjectcreeteabstractclass {

	public static void main(String[] args) {
		City city = new City("Shital") {
			public void showpincode(String s) {
				System.out.println("hello:::" + s);
			}

			public void run_2() {
				System.out.println("running...");
			}
		};
		city.show();
		city.showpincode("12342");
		//city.run_2//not allowed because Even though the anonymous class defines run_2(),
		//you cannot access it using a reference of type City,
		//because the compiler only recognizes members declared in City.
	}
}

abstract class City {
	String name;

	public void show() {
		System.out.println(this.name);

	}

		public City(String name)
		{
			this.name=name;
		}

	abstract public void showpincode(String pin);

}
//
// class Pune extends City
// {
//
//		@Override
//		public void showpincode(String pin) {
//			// TODO Auto-generated method stub
//
//			System.out.println("child class");
//		}
//
// }
//
