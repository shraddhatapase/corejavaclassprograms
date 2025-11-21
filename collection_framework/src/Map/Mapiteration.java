package Map;
import java.util.*;
import java.util.Map.Entry;
public class Mapiteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Long,String> cities=new HashMap<Long,String>();
		cities.put(43567892L, "RAni");
		cities.put(2345671L, "vanita");
		cities.put(3544564L, "radha");
		cities.put(324354345L, "RAni");
		System.out.println(cities.remove(3544564L));
		System.out.println(cities.entrySet());
		for(Entry<Long,String> e:cities.entrySet()) {
			System.out.println(e.getValue());
			System.out.println(e.getKey());
			
		}
		for(long l:cities.keySet()) {
			System.out.println(l);
		}
		for(String str:cities.values()) {
			System.out.println(str);
		}
	}

}
