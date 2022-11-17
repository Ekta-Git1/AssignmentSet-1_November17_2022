package Java_Assignment;
/* Calculate Time & Distance */

import java.util.Scanner;

public class TimeDistance {
	 Scanner scan = new Scanner(System.in);
	 	double dist;
	 	double time;
	 	double speed;
	 	double cal_speed;
	 	double cal_time;
	 	double cal_distance;
	 	
	 	void Speed() {
	 		 System.out.println("Enter distance to measure speed:");
	         dist = scan.nextDouble();
	         System.out.println("Enter time to measure speed:");
	         time = scan.nextDouble();
	         cal_speed = dist / time;
	         System.out.println("\n The Calculated Speed(km / hr) is : "+ cal_speed);
	    }
     
	 	void Time() {
	 		System.out.println("Enter distance to measure time:");
	         dist = scan.nextDouble();
	         System.out.println("Enter speed to measure time:");
	         time = scan.nextDouble();
	         cal_time = dist / speed;
	         System.out.println("\n The Calculated Speed(km / hr) is : "+ cal_time);
	    }
	 	
	 	void Distance()
	 	{
	 		System.out.println("Enter speed to measure distance:");
	 		dist = scan.nextDouble();
	 		System.out.println("Enter time to measure distance:");
	 		time = scan.nextDouble();
	 		cal_distance = speed * time;
	 		System.out.println("\n The Calculated Speed(km / hr) is : "+ cal_distance);
   
	 	}
    
	 	public static void main(String args[])
	 	{
	 		TimeDistance cal = new TimeDistance();
	 		cal.Speed();
	 		cal.Time();
	 		cal.Distance();
		}
}
