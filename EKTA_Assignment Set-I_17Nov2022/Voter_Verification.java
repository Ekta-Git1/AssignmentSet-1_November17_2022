package Java_Assignment;

/*Create a method which accepts a hash map and return the values 
  of the map in sorted order as a List. 
  (Return the values of a hash map in sorted order)
*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Voter_Verification 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> hash = new HashMap<>();
		hash.put(101, 1999);
		hash.put(102,2001);
		hash.put(103, 2005);
		List<Integer> list = sortByDob(hash);
		
		for (Integer i : list) 
		{
           System.out.println(i);
		}
	}
	public static List<Integer> sortByDob(Map<Integer, Integer> hash) 
	{
		
			List<Integer> nums = hash.entrySet().stream()
					.filter(i->i.getValue()<2004).map(j->j.getKey())
					.collect(Collectors.toList());
			
			return nums;
			
		
	}

}

