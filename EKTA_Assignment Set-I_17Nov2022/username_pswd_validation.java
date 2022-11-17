package Java_Assignment;

/*Write a method that uses lambda expression to accept username and password and
return true or false. 
(Hint: Use any custom values for username and password for authentication)*/

import java.util.function.Predicate;
@FunctionalInterface
interface userPswd
{
	boolean check(boolean b, boolean c);

}
public class username_pswd_validation 
{

	public static void main(String[] args) 
	{
		String userName = "ekta";
		String pswd = "Valhe";
		// Creating predicate, Its afunctional Interface to return boolean based on condition
        Predicate<String> usVal = i -> (i.equalsIgnoreCase(userName)); 
        Predicate<String> psVal = i -> (i.equalsIgnoreCase(pswd));
        boolean s1 = usVal.test("ekta");
        boolean s2 = psVal.test("Valhe");
        userPswd up = (boolean i , boolean j)->
        {
        	if(s1==true && s2 == true) {
        		return true;
        	}else {
        		return false;
        	}
        };
        
        System.out.println("Username and Password validation : "+ up.check(s1,s2));
      
       
       
		
	}

}
