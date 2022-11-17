package Java_Assignment;

/*Area and Circumference of Triangle, Circle, Square, Rectangle*/

import java.util.Scanner;
	public class ShapeAreas
	{
	    Scanner scan = new Scanner(System.in);
	    
	    void Triangle() {
	    System.out.println("Enter the width of the Triangle:");
        double base = scan.nextDouble();
        System.out.println("Enter the height of the Triangle:");
        double height = scan.nextDouble();
        double T_area = (base * height) / 2;
        System.out.println("Area of Triangle is: " + T_area);
	    }
	    
	    void Circle() {
		System.out.print("Enter the radius of the Circle: ");
		double radius = scan.nextDouble();
		double C_area = Math.PI * (radius * radius);
		System.out.println("The area of circle is: " + C_area);
		double C_circumference= Math.PI * 2*radius;
		System.out.println( "The circumference of the circle is:"+C_circumference) ;
    	}
	    
	    void Rectangle() {
	    System.out.println("Enter the length of Rectangle:");
        double length = scan.nextDouble();
        System.out.println("Enter the width of Rectangle:");
        double width = scan.nextDouble();
        double R_area = length * width;
        System.out.println("Area of Rectangle is:" + R_area);
	    }
	    
	    void Square() {
	    System.out.println("Enter Side of Square:");
        double side = scan.nextDouble();
        double S_area = side * side;
        System.out.println("Area of Square is: " + S_area);
	    }
	    
	   public static void main(String args[])
	   {
		   ShapeAreas area = new ShapeAreas();
		   area.Triangle();
		   area.Circle();
		   area.Rectangle();
		   area.Square();
	   }
	}