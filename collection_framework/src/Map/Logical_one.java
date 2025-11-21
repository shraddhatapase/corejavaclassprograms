package Map;
import java.util.*;
public class Logical_one {
	public static void main(String[] args) {
		String str="Radhikakashi";
		char[] chars=str.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>(); 
		for(int i=0;i<chars.length;i++) {
			int counter=1;
			if(map.containsKey(chars[i])) {
				counter=map.get(chars[i])+1;
				map.put(chars[i],counter);
			}else {
				map.put(chars[i],counter);
			}
		}
		System.out.println(map);
	}
}
