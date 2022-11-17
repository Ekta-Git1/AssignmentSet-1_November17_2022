package Java_Assignment;

/*Calculate Simple and compound Interests*/

import java.util.Scanner;

public class CalculateInterest {

  public static void main(String[] args) {
	  double principal;
	  double rate;
	  double time ;
	  double s_interest;
	  double c_interest;
	 
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the principal: ");
    principal = scan.nextDouble();

    System.out.print("Enter the rate: ");
    rate = scan.nextDouble();

    System.out.print("Enter the time: ");
    time = scan.nextDouble();

    s_interest = (principal * time * rate) / 100;
    c_interest = principal * Math.pow(1.0+rate/100.0,time)-principal;

    System.out.println("Principal: " + principal);
    System.out.println("Interest Rate: " + rate);
    System.out.println("Time Duration: " + time);
    System.out.println("Simple Interest: " + s_interest);
    System.out.println("Compound Interest: " + c_interest);

    scan.close();
  }
}
