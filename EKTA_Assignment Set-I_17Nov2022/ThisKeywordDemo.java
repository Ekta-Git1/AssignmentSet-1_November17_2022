package Java_Assignment;

public class ThisKeywordDemo {
	  int x;

	  public ThisKeywordDemo(int x) {
	    this.x = x;
	  }

	  public static void main(String[] args) {
		  ThisKeywordDemo myObj = new ThisKeywordDemo(5);
	    System.out.println("Value of x = " + myObj.x);
	  }
	}
