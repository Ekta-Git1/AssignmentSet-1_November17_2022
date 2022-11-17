package Java_Assignment;

import java.util.Scanner;

public class PerimeterOfTriangle_WithConstructor {
		private double a; 
		private double b;
		private double c;
		
		PerimeterOfTriangle_WithConstructor(double a, double b, double c)
		{
			this.a=a;
			this.b=b;
			this.c=c;
		}
		
		
	     private double getPerimeter()
	    {
	      
	        return (a+b+c);
	    }
	     
	     private double getArea()
	     {
	      
	    	 double s = (a + b + c)/2; 
	 		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	     }
	 
	    public static void main(String[] args)
	    {
	        //lengths for 3sides of triangle declared
	        double a = 3;
	        double b = 4;
	        double c = 5;
	        PerimeterOfTriangle_WithConstructor obj=new PerimeterOfTriangle_WithConstructor(a,b,c);
	        System.out.println("Perimeter: "+obj.getPerimeter());
	        System.out.println("Area: "+obj.getArea());
	    }
		

	}
