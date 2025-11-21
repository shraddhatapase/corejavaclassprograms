package setif;
import java.util.*;

public class TreeSetmydemo {
	public static void main(String[] args) {		
	TreeSet obj=new TreeSet(new Abc());
	obj.add(10);
	obj.add(10);
	obj.add(12);
	obj.add(25);
	obj.add(2);
	obj.add(12);
	System.out.println(obj);
	}
}
class Abc implements Comparator{
	public int compare(Object obj1,Object obj2){
		Integer I=(Integer)obj1;
		Integer I1 =(Integer)obj2;
		if(I>I1) {
			return -1;
		}else if(I1>I) {
			return 1;
		}else {
			return 0;
		}	
		//return I.compareTo(I1);
		//return -1;
	}
}
