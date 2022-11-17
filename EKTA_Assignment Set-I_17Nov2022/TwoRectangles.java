package Java_Assignment;

public class TwoRectangles {

	
	 int lenght;
	    int breath;

	    TwoRectangles  (int l, int b) {
	        this.lenght = l;
	        this.breath = b;
	    }

	    public int area()
	    {
	        return lenght * breath;
	    }
	
	    public static void main(String[] args) {
	    	TwoRectangles obj = new TwoRectangles(4,5);
	    	TwoRectangles obj1 = new TwoRectangles(5,8);

	        System.out.println(obj.area());
	        System.out.println(obj1.area());


	    }


	}

