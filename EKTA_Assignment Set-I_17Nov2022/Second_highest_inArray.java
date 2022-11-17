package Java_Assignment;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Second_highest_inArray {

	public static void main(String[] args) {

		Integer[] arr = {34,1,3,45,30,16,98,12};
		int sh = secondHighest(arr);
		System.out.println(sh);
	}

	private static int secondHighest(Integer[] arr) {

		//Taken tree set to remove duplicate elements and can return index len-2
		Set<Integer> set = new TreeSet<>(Arrays.asList(arr));
		
		Object[] a = set.toArray();
		int secondNum = (int)a[a.length-2];
		return secondNum;
	}

}
