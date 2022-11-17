package Java_Assignment;
/*Write a program that would print the information 
 *(name, year of joining, salary, address) of three employees by creating a class named 
 *'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat
 * */
public class Emp_Info 
	{
		String Name;
		int Year;
		String Address;
		Emp_Info(String nam, int years, String addr)
		{
			Name = nam;
			Year = years;
			Address = addr;
		}

		void Sam()
		{
			System.out.println(Name + "        " + Year + "         " + Address);
		}

		void Robert()
		{
			System.out.println(Name + "     " + Year + "            " + Address);
		}

		void John()
		{
			System.out.println(Name + "    " + Year + "       " + Address);
		}

		public static void main(String args[])
		{
			System.out.println("Name" + "  Year of Joining     " + "Address");
			Emp_Info e = new Emp_Info("Sam", 2000, "68D-WallsStreet");
			e.Sam();
			Emp_Info e1 = new Emp_Info("Robert", 1994, "64C-WallsStreet");
			e1.Robert();
			Emp_Info e2 = new Emp_Info("John", 2002, "70F-WallsStreet");
			e2.Sam();
		}
	}
