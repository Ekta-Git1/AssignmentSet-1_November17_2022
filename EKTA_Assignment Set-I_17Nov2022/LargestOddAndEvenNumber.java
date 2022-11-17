package Java_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargestOddAndEvenNumber {
	
	public static void main(String[] args)
	{
		double evenpositive = 0, oddpositive = 0, sum = 0;
		int negativenumbers=0;
		int counter = 0, input = 0, large = Integer.MIN_VALUE, small = Integer.MAX_VALUE;
		List<Integer> oddList=new ArrayList<Integer>();
		List<Integer> evenList=new ArrayList<Integer>();
		System.out.print("Enter a series of values (0 to quit): ");
		Scanner in = new Scanner(System.in);
		while ((input = in.nextInt()) != 0) {
		    small = Integer.min(small, input);
		    large = Integer.max(large, input);
		    sum += input;
		    counter++;
		    if (input % 2 == 0) {
		    	if (isPositive(input))
		    	{
		    	evenpositive++;
		    	evenList.add(input);
		    	}
		    	else
		    	{
		    		negativenumbers++;
		    	}
		    } else {
		    	if(isPositive(input))
		    	{
		        oddpositive++;
		        oddList.add(input);
		    	}
		    	else
		    	{
		    		negativenumbers++;
		    	}
		    }
		}

		if (counter > 0) {
		    System.out.println("Total evenpositive numbers entered are " + evenpositive);
		    System.out.println("Total oddpositive numbers entered are " + oddpositive);
		    System.out.println("Total negative numbers entered are: " + negativenumbers);
		    Collections.sort(oddList);
		    if(oddList.size()>0)
		    {
		    int largestOddNumber=oddList.get(oddList.size() - 1);
		    System.out.println("Largest Odd Number: " + largestOddNumber);
		    }
		    Collections.sort(evenList); 
		    if(evenList.size()>0)
		    {
		    int largestEvenNumber=evenList.get(evenList.size() - 1);
		    System.out.println("Largest Even Number: " + largestEvenNumber);
		    }
		} else {
		    System.out.println("No data was entered.");
		}
		
	}
	
	private static boolean isPositive(int n)
	{
		if(n>0)
		{
			return true;
		}
		return false;
	}

}

