package Java_Assignment;
/* Create a method that accepts a character array and count the number of times each 
 * character is present in the array. Add how many times each character is present in
 * the array. Add how many  times each character is present to a hashmap with the 
 * character as key and the repetitions count as value (Count the Number of times each 
 * character appears in the array. Add the details into a hash map with character as 
 * key as count as value.
 * Example: 
 * {'A','P','P','L','E'} 
 * Output: Will be hashmap with the following contents {'A':1, 'P':2, 'L':1, 'E':1})
 */
import java.util.HashMap; 
import java.util.Map;

public class HashMapArrayCount {
	public static void main(String[] args) {
		String string = "A P P L E";
		Map<String, Integer> map = new HashMap<>();
		String[] words = string.split(" ");{
		for(String word : words) {
			Integer in = map.get(word);
			if(in == null) {
				map.put(word, 1);
			}
			else {
				map.put(word, 1 + in);
			}
			System.out.println(map);
		}
	}
 }
}