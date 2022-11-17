package Java_Assignment;

//Write a lambda expression which accepts x and y numbers and return xy.

@FunctionalInterface
interface funInterface
{
    int operations(int a, int b);
}
public class TakeInput_returnOutput  {

	
	public static void main(String[] args) 
	{
		//addition
		funInterface add = (int a, int b)->( a+b );
		
		System.out.println("After Adition : "+add.operations(2, 3));
		
		funInterface sub = (int a, int b)->( a-b );
		
		System.out.println("After Subtraction : "+sub.operations(10, 3));
		
		//multiplication
		funInterface mul = (int a, int b)->( a*b );
		
		System.out.println("After Multiplication : "+mul.operations(9, 3));
		
		//division
		funInterface div = (int a, int b)->( a/b );
		
		System.out.println("After Division : "+div.operations(6, 3));
		 
	}
	

}

