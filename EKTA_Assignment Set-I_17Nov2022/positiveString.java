package Java_Assignment;

/*Create a method that accepts a String and checks if it is a positive string. 
 * A string is considered a positive string, if on moving from left to right each 
 * character in the String comes after the previous characters in the Alphabetical order.
 * For Example: ANT is a positive String (Since T comes after N and N comes after A). 
 * The method should return true if the entered string is positive.
*/
import java.util.Arrays;

public class positiveString {

	public static void main(String[] args) {

		//String str = "ANT";
		String str = "AbCdefghia";
		
		if(positiveString(str)) {
			
			System.out.println("yes! it a Postive string");
		}else {
			System.out.println("Nope! it is not postive string");
		}
	}

	private static boolean positiveString(String str) {
	
	String s = str.toLowerCase();
	char[] c = s.toCharArray();
	Arrays.sort(c);
    for (int i = 0; i < s.length(); i++) 
    {
    	 if (c[i] != s.charAt(i)) {
    		 return false;
    	 }
             
    }        
    return true;    
    }

}
