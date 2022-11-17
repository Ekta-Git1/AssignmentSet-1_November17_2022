package Java_Assignment;

/*Write a Java Program for Fibonacci Series*/

import java.util.Scanner;

class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of terms");
		int n = scan.nextInt();
		series(n);
	}
	
	static void series(int num)
	{
		System.out.println("Fibonacci series for the entered term limit is ");
		int i=0,j=1,next;
		for(int c=0;c<num;c++)
		{
			if(c<=1)
				next=c;
			else
			{
				next=i+j;
				i=j;
				j=next;
			}
			System.out.print(next+" ");
		}
	}
}