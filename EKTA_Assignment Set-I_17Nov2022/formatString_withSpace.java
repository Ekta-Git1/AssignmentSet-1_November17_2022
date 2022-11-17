package Java_Assignment;
/*Write a method that uses lambda expression to format a given string, 
 * where a space is inserted between each character of string. 
 * For ex., if input is “CG”, then expected output is “C G”.
 * */
@FunctionalInterface
interface stringFormat{
	
	String format(String s);
}
public class formatString_withSpace {

	public static void main(String[] args) 
	{
		stringFormat sf =(String s) ->s.replace("", " ").trim();
		
		System.out.println("After Formatting String with space : "+sf.format("Ekta"));
			
			
		}
	}
