package Java_Assignment;

import java.util.HashMap;
import java.util.Map;

public class Character_Array_counttoHashMap {

	public static void main(String[] args) 
	{
		
		char [] ch = {'V','E','N','K','A','T','T'};
		
		Map<Character, Integer> m  = charCount(ch);
		for(Map.Entry<Character, Integer> i : m.entrySet()) 
		{
			System.out.println("Charcater = " + i.getKey()
            + ", Occurance = "
            + i.getValue());
			
		}
		
	}
	public static Map<Character, Integer> charCount(char[] ch)
	{
		Map<Character, Integer> hash = new HashMap<>();
		for(int i = 0; i<ch.length; i++) {
			
			if(hash.containsKey(ch[i])) {
				
				int count = 0;
				count = hash.get(ch[i]);
				hash.put(ch[i], count+1);
			}else {
				hash.put(ch[i], 1);
			}
		}
		
		return hash;
		
		
	}

}


