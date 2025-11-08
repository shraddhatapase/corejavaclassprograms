//Output:
//LinkedList remove time: 556300 ns
//ArrayList remove time: 39100 ns
package ArrayList;
import java.util.*;
public class DeleteTimeComparison {
	public static void main(String[] args) {
		int size = 100000; // 1 lakh elements
		// Create ArrayList and LinkedList
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		for (int i = 0; i < size; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}
		long startLinked = System.nanoTime();
		linkedList.remove(99999); // remove from middle
		long endLinked = System.nanoTime();
		// Measure time for ArrayList deletion
		long startArray = System.nanoTime();
		arrayList.remove(99999); // remove from middle
		long endArray = System.nanoTime();
		// Measure time for LinkedList deletion		
		
		System.out.println("LinkedList remove time: " + (endLinked - startLinked) + " ns");
		System.out.println("ArrayList remove time: " + (endArray - startArray) + " ns");
	}
}
//ArrayList remove time: 46000 ns
//LinkedList remove time: 480100 ns
//ArrayList remove time: 35900 ns
//LinkedList remove time: 495600 ns
