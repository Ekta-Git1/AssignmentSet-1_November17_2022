package Java_Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Students_Medals {

	
	public static void main(String[] args) 
	{
		HashMap<String,Integer> hash = new HashMap<>();
		hash.put("151", 91);
		hash.put("152", 85);
		hash.put("153", 75);
		hash.put("154", 90);
		Map<String,String> hm1 = getStudentMedals(hash);
		
		Map<String, String> sortTree = new TreeMap<>();
		sortTree.putAll(hm1);
		
		for (Map.Entry<String, String> i :sortTree.entrySet()) 
		{
           System.out.println("Key = " + i.getKey()
                              + ", Value = "
                              + i.getValue());
		}

		
	}

	private static Map<String, String> getStudentMedals(HashMap<String, Integer> hash) {

		Map<String,String> finalmap = new HashMap<>();
		
		for(Map.Entry<String, Integer> i : hash.entrySet()) {
			
			if(i.getValue()>=90) 
			{
				finalmap.put(i.getKey(),"Gold");
			}else if(i.getValue()>=80 && i.getValue()<90) {
				finalmap.put(i.getKey(), "Silver");
			}else if(i.getValue()>=70 && i.getValue()<80) {
				finalmap.put(i.getKey(), "Bronze");
			}else {
				finalmap.put(i.getKey(), "No Medel this year");
			}
		}
		return finalmap;
	}

}