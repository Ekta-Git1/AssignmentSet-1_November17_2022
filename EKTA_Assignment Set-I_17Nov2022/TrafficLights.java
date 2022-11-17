package Java_Assignment;

/* Write a Java Program that simulates a traffic light. 
The program lets the user select
 one of three lights red, yellow, or green with radio buttons. On entering the choice,
 an appropriate message with "STOP" or "READY" or "GO" should appear in the console. 
 Initially there is no message shown.
 */

import java.util.Scanner;

public class TrafficLights {

	public static void main(String[] args) {
			int option = 0;
			System.out.println("1.RED");
			System.out.println("2.YELLOW");
			System.out.println("3.GREEN");
			System.out.println("Select Light: ");
			Scanner scan =new Scanner(System.in);
			option = scan.nextInt();
			switch(option) {
			case 1:
				System.out.println("STOP ON RED");
				break;
			case 2:
				System.out.println("READY ON YELLOW");
				break;
			case 3:
				System.out.println("GO ON GREEN");
				break;
			default:
				System.out.println("INVALID OPTION");
			}
			
				scan.close();
	}


}
