package Java_Assignment;
/* Create a method which accepts an array of numbers and returns the numbers 
 * and their squares in HashMap (Iterate through the list, find the square each number
 * and add the elements to a map object with the number as the key an the square 
 * as the value)
 */

import java.util.HashMap;
import java.util.Iterator;

public class ReturnNumberWithSquare {
	public static HashMap<Integer, Integer> method(int[] array) {
		HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		for(int n : array) {
			//HashMap map = null;
			hm.put(n, n*n);
		}
	//	return null;
		return hm;
	}
	public static void main(String[] args) {
		int array[] = new int[] {1,2,3,4,5,6,7,8,9};
		HashMap<Integer, Integer> hm = method(array);
		Iterator<Integer> in = hm.keySet().iterator();
		while(in.hasNext()) {
			Integer key = in.next();
			System.out.println(key + ":" + hm.get(key));
		}
	}

}