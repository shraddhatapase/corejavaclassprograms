package StreamPrograminterface;
	import java.util.*;
	import java.util.stream.*;
	public class Removeduplicates {
	    public static void main(String[] args) {
	        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 5);
	        //List<Integer> result = list.stream()
//	                                   .distinct()
//	                                   .collect(Collectors.toList());
	        list.stream()
           .distinct()
           .forEach(System.out::println);
	       // System.out.println(result);
	    }
	}

