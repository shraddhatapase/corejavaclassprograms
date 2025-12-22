package StreamPrograminterface;

import java.util.*;
import java.util.stream.*;

public class CheckDuplicates {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 2 };

		boolean hasDuplicates = Arrays.stream(arr).distinct().count() != arr.length;

		System.out.println(hasDuplicates);
	}
}
//count() → counts unique elements
//
//Compare with original array length