package Java_Assignment;

import java.util.Scanner;

/* Input the name of the user in the format " Firstname MiddleName 
 * and Lastname" (e.g. Krishna Govind Murari). 
 * Display a message in the format" Welcome K.G. Murari".
 * (Note that the user can input in any case, 
 * but the output should be having the initials in uppercase)
 */


public class InitialName {
	static void printName(String uname){
		
		//int unlen = uname.length();
		uname = uname.trim();
		String name ="";
		System.out.print("Welcome ");
		for (int i=0;i<uname.length();i++) {
			char ch = uname.charAt(i);
			if(ch !=' ') {
				name = name + ch;
			}

		else {
			System.out.print(Character.toUpperCase(name.charAt(0))+". ");
			name="";
			}
		} 
		
		
		String temp="";
		for(int j=0; j<name.length(); j++) {
			if(j==0) 
				temp = temp + Character.toUpperCase(name.charAt(0));
			else 
			temp = temp + Character.toLowerCase(name.charAt(j));
				
		
		}
		System.out.println(temp);
	}
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Username: ");
			
			String uname = scan.nextLine();
		//	String uname = "Ekta Ramesh Valhe";
			printName(uname);
			
			}
	}
