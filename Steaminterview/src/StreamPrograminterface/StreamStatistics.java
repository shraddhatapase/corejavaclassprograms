package StreamPrograminterface;

import java.util.*;

public class StreamStatistics {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		IntSummaryStatistics stats = list.stream().mapToInt(Integer::intValue).summaryStatistics();

		System.out.println("Min     : " + stats.getMin());
		System.out.println("Max     : " + stats.getMax());
		System.out.println("Sum     : " + stats.getSum());
		System.out.println("Average : " + stats.getAverage());
		System.out.println("Count   : " + stats.getCount());
	}
}
