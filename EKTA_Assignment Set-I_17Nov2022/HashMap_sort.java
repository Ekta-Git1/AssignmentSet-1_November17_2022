package Java_Assignment;
/*Create a method which accepts a hash map and return the values 
  of the map in sorted order as a List. 
  (Return the values of a hash map in sorted order)
  */

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMap_sort 
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer> hash = new HashMap<>();
		hash.put("a", 101);
		hash.put("b", 105);
		hash.put("c", 99);
		Map<String,Integer> hm1 = sortByValue(hash);
		
		for (Map.Entry<String, Integer> i :hm1.entrySet()) 
		{
           System.out.println("Key = " + i.getKey()
                              + ", Value = "
                              + i.getValue());
		}
	}
	public static HashMap<String, Integer> sortByValue(Map<String, Integer> hash) 
	{
		
			List<Map.Entry<String, Integer>> ls = new LinkedList<Map.Entry<String, Integer>>(hash.entrySet());
			
			Collections.sort(ls, (o1,o2)->(o1.getValue().compareTo(o2.getValue())));
			
			HashMap<String, Integer> temp = new LinkedHashMap<>();
			
			for(Map.Entry<String, Integer> m : ls) {
				
				temp.put(m.getKey(),m.getValue());
			}
			
			return temp;
			
		
	}

}
