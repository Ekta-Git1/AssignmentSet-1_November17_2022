package Java_Assignment;

/* Input a line of string and reverse all the words  
 * in a string that have odd lengths.
 */

import java.util.Scanner;

public class ReverseStr {
	
	   static String strRev(String string) {
		String[] string_words = string.split(" ");
		for(int i = 0; i < string_words.length; i++) {
			if(string_words[i].length() % 2 != 0) {
				StringBuilder reverseLetter = new StringBuilder(string_words[i]);
				string_words[i] = reverseLetter.reverse().toString();
				}
		}
		
		return String.join(" ", string_words);
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The String: ");
		String text = scan.nextLine();
		System.out.println("Reverse String with Odd Length: " + strRev(text));
	}
} 