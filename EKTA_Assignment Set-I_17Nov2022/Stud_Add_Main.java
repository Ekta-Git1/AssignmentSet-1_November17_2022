package Java_Assignment;

public class Stud_Add_Main {		
		
		
		public static void main(String[] args)
		{
			Stud_Add john=new Stud_Add("John","8457656644", "3-4-55,Kukatpally,Hyd" ,"10");
			System.out.println("Name: " +john.getName());
			System.out.println("Roll No: " +john.getRoll_no());
			System.out.println("Phone Number: " +john.getPhonenumber());
			System.out.println("Address: " +john.getAddress() +"\n");
			
			Stud_Add sam=new Stud_Add("Sam","8099587996", "3-4-57,Electronic City,Bangalore" ,"11");
			System.out.println("Name: " +sam.getName());
			System.out.println("Roll No: " +sam.getRoll_no());
			System.out.println("Phone Number: " +sam.getPhonenumber());
			System.out.println("Address: " +sam.getAddress());
		}

	}
