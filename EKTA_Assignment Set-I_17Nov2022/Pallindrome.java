package Java_Assignment;

//Java program to find pallindrome number
import java.util.*;
public class Pallindrome 
{  
	public static void main(String[] args) 
	{  
		Scanner scan = new Scanner(System.in);  
		System.out.println("Enter the number: ");  
		int num = scan.nextInt();
		int r,sum=0;
		int temp=num;    
		while(num>0)
		{    
			r=num%10;    
			sum=(sum*10)+r;    
			num=num/10;    
		}    
		if(temp==sum)    
			System.out.println("The entered number "+temp+" is a palindrome number ");    
		else    
			System.out.println("The entered number "+temp+" is not a palindrome");    
	}  
} 

