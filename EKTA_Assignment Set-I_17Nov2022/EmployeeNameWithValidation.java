package Java_Assignment;

/* Write a Java Program to validate the full name of an employee. 
	Create and throw a user
 * defined exception if FirstName and LastName is blank.
 */

import java.util.Scanner;

public class EmployeeNameWithValidation {
	public void validatename(String firstName, String lastName) throws EmployeeNameValidationException{
		if(firstName.equals(null) || lastName.equals(null) || firstName.equals("") || lastName.equals("")) {
		throw new EmployeeNameValidationException("FirstName & LastName Can't be Empty");
		}
		else {
			System.out.println("Validation Successful");
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String FirstName = scan.nextLine();
		System.out.println("Enter Last Name: ");
		String LastName = scan.nextLine();
		
		try {
			EmployeeNameWithValidation enwv = new EmployeeNameWithValidation();
			enwv.validatename(FirstName,LastName);
		}
		catch (EmployeeNameValidationException e){
		System.out.println("e.getMessage()");
	}

}
class EmployeeNameValidationException extends Exception{
	public EmployeeNameValidationException(String message) {
		super(message);
	}
}
}