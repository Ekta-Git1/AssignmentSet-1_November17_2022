package Java_Assignment;

/*Write a method to calculate factorial of a number. Test this method using method
reference feature.*/

@FunctionalInterface
interface fact
{
	int factorial(int a);
	
}

//can be optimized using lambda

public class factorialUsingMethod_reference {

	public static void main(String[] args) 
	{
		fact f = new fact() {

			@Override
			public int factorial(int n) {

				if(n == 0 || n==1) {
					return  1;
				}else {
					return (n*factorial(n-1));
				}
			}
		};
		System.out.println(f.factorial(5));
			
	}
	

}

