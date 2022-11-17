package Java_Assignment;

import java.util.Scanner;

public class RectangleWithKeyboard {
	
	private int a;
	private int b;
	
	RectangleWithKeyboard(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	int returnArea()
	{
		return a*b;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Please Enter Length");
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		
		System.out.println("Please Enter Breadth");
		int breadth=sc.nextInt();
	
		RectangleWithKeyboard rc=new RectangleWithKeyboard(length,breadth);
		System.out.println("Area Of Rectangle is: "+rc.returnArea());
		
	
	}

}


