package Java_Assignment;

/*Prompt the user to input the list of languages known separated by commas 
 * (e.g. English, Hindi, Marathi, Telugu, Kannada). Display the output 
 * as follows
 * 	Languages Known:
 * 	1. English
 * 	2. Hindi
 * 	3. Marathi
 * 	4. Telugu
 * 	5. Kannada 
 */



import java.util.*;

public class RowListToColumnList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the list of languages you know: ");
		String string = scan.nextLine();
		System.out.println("Languages Known: ");
	//	String string = "English, Hindi, Marathi, Telugu, Kannada";
		String [] arrOfstr = string.split(",");
		int n = arrOfstr.length;
		int i = 1;
		
		for(String a : arrOfstr) {
			
			System.out.println(i + ". " + a);
			i++;
		
	}

}
}