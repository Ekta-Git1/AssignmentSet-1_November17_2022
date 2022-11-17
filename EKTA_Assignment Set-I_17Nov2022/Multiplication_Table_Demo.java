package Java_Assignment;

import java.util.Scanner;

public class Multiplication_Table_Demo {
	 
		public static void main(String[] args)
	    {
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Number");
			int N=scan.nextInt();
	        
			for (int i = 1; i <= 10; i++) {
	            System.out.println(N + " * " + i + " = "+ N * i);
	        }
	        scan.close();
	    }
	}