package setif;

import java.util.*;


public class TreeSetstringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet obj= new TreeSet(new MyComaparable());
		obj.add("Rani");
		obj.add("Asha");
		obj.add("Manisha");
		obj.add("Komal");
		obj.add("Mahesh");
System.out.println(obj);
	}

}
class MyComaparable implements Comparator{
	//int compare(T o1, T o2);
	public int compare(Object obj1,Object obj2){
		String o1=(String)obj1;
		String o2=(String)obj2;
		
		return o2.compareTo(o1);
		
	}
}
