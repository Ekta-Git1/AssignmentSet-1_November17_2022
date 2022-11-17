package Java_Assignment;

import java.util.Scanner;

public class MultiplicationOfTwoDigits {
 
	public static void main(String[] args)
    {
       
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number From");
		int from=scan.nextInt();
		System.out.println("Enter Number To");
		int to=scan.nextInt();
		
		int small = Math.min(from, to) ;
		int big = Math.max(from, to);

		System.out.println("How many integers are between " + small +  " and " + big + "???");
		System.out.println("Answer : " + (big - small + 1));

		for (int i = small; i <= big; i++)
		{
			printTable(i);
		}
        
        scan.close();
    }
	
	private static void printTable(int n)
	{
		 for (int i = 1; i <= 10; i++) {
			 
	            System.out.println(n + " * " + i + " = "+ n * i);
	        }
		 System.out.println();
	}
}


