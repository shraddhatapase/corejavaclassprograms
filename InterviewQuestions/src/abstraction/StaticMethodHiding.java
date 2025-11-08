package abstraction;
public class StaticMethodHiding {
	public static void main(String[] args) {
		Actor obj=new Kartik();
		Kartik kartik=new Kartik();
		kartik.showclass();
		Actor obj1= new Actor();
		obj.showclass();
		obj1.showclass();
		Kartik.showclass();
		Actor.showclass();
	}
}
class Actor {
	public static void showclass()
	{
		System.out.println("This is the actor class..");
	}
}
class Kartik extends Actor {
	public static void showclass() {
		System.out.println("are helloooo!");
	}
}
