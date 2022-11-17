package Java_Assignment;

/*Print the sum, difference and product of two complex numbers by 
 * creating a class named 'Complex' with separate methods for each operation 
 * whose real and imaginary parts are entered by user.*/

public class ComplexNumberDemo {

		int real, imaginary;

		ComplexNumberDemo() {}

		ComplexNumberDemo(int tempReal, int tempImaginary) {
			real = tempReal;
			imaginary = tempImaginary;
		}
		
		ComplexNumberDemo addComp(ComplexNumberDemo C1, ComplexNumberDemo C2) {

			ComplexNumberDemo temp = new ComplexNumberDemo();
			temp.real = C1.real + C2.real;
			temp.imaginary = C1.imaginary + C2.imaginary;
			return temp;
		}

			ComplexNumberDemo subtractComp(ComplexNumberDemo C1, ComplexNumberDemo C2) {
	
			ComplexNumberDemo temp = new ComplexNumberDemo();
			temp.real = C1.real - C2.real;
			temp.imaginary = C1.imaginary - C2.imaginary;
			return temp;
		}
		
		ComplexNumberDemo productComp(ComplexNumberDemo C1, ComplexNumberDemo C2) {
		
			ComplexNumberDemo temp = new ComplexNumberDemo();
			temp.real = C1.real * C2.real;
			temp.imaginary = C1.imaginary * C2.imaginary;
			return temp;
		}
		
		void printComplexNumber() {
			System.out.println("Complex number: " + real + " + " + imaginary + "i");
		}		

		public static void main(String[] args) {

		
			ComplexNumberDemo C1 = new ComplexNumberDemo(3, 2);
			C1.printComplexNumber();
			ComplexNumberDemo C2 = new ComplexNumberDemo(9, 5);
			C2.printComplexNumber();
			ComplexNumberDemo C3 = new ComplexNumberDemo();
			C3 = C3.addComp(C1, C2);
			System.out.print("Sum of ");
			C3.printComplexNumber();
			C3 = C3.subtractComp(C1, C2);
			System.out.print("Difference of ");
			C3.printComplexNumber();
			C3 = C3.productComp(C1, C2);
			System.out.print("Product of ");
			C3.printComplexNumber();
		}
	}
