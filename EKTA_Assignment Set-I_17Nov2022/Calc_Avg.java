package Java_Assignment;

/*Print the average of three numbers entered by user by creating a class named 
 * 'Average' having a method to calculate and print the average.*/

import java.util.Scanner;

public class Calc_Avg {
		
		private static int calculate(int firstnum, int secondnum,int thirdnum)
		{
			return (firstnum+secondnum+thirdnum)/3;
		}
		
		public static void main(String[] args)
		{
			System.out.println("Please Enter First Number.");
			Scanner sc=new Scanner(System.in);
			int firstnum=sc.nextInt();
			System.out.println("Please Enter Second Number.");
			int secondnum=sc.nextInt();
			System.out.println("Please Enter Third Number.");
			int thirdnum=sc.nextInt();
			
			System.out.println("Average = "+calculate(firstnum,secondnum,thirdnum));
			
		}

	}
