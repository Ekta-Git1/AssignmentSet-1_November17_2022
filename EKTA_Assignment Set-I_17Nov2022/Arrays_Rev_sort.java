package Java_Assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Arrays_Rev_sort {

	public static void main(String[] args) 
	{
		
		Integer[] nums = {7,1,6,9,2,0,5,45,93,6};
		
		Integer[] arr = revAndSort(nums);
		for(Integer i : arr) {
			System.out.println(i);
		}
		
	}
	public static Integer[] revAndSort(Integer[] nums)
	{
		Integer[] a = new Integer[nums.length];
		for(int i = 0,j = a.length-1; i<a.length; i++,j--) {
			a[j] = nums[i];
		}
		Arrays.sort(a);
		
		return a;
		
		
	}

}
