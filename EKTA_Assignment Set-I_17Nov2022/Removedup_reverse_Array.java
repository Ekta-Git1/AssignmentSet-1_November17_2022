package Java_Assignment;

/*Create a method which accepts an integer array and removes 
  all the duplicates in the array. Return the resulting array in descending order 
  (Remove the duplicate elements in the array and sort it in descending order)
*/	

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Removedup_reverse_Array {

	public static void main(String[] args) 
	{
		Integer[] arr = {3,6,26,7,3,4,10,10,16,16};
		List<Integer> ls = removeDuplicatesRevSort(arr);
		
		for(Integer i : ls) {
			System.out.println(i);
		}
	}

	private static List<Integer> removeDuplicatesRevSort(Integer[] arr) 
	{
		List<Integer> list = Arrays.asList(arr);
		
		List<Integer> ls = list.stream().distinct().
				sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		return ls;
		
	}

}
