package Java_Assignment;

public class TraingleAreaPerimeterWithConstructor 
{
	private double a; 
	private double b;
	private double c;
	
	TraingleAreaPerimeterWithConstructor(double a, double b, double c)
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
      
    	 double s = (a + b + c)/2; // Perimeter/2
 		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
     }
 
    
    public static void main(String[] args)
    {
        double a = 3;
        double b = 4;
        double c = 5;
        TraingleAreaPerimeterWithConstructor obj=new TraingleAreaPerimeterWithConstructor(a,b,c);
        System.out.println("Perimeter: "+obj.getPerimeter());
        System.out.println("Area: "+obj.getArea());
    }
}
