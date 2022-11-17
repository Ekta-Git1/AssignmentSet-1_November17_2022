package Java_Assignment;
/* You are asked to create an application for registering the details of jobseeker. 
 * The requirement is: Username should always end with _job and there should be at least 
 * minimum of 8 characters to the left of _job. 
 * Write a function to validate the same. Return true in case the validation is passed. 
 * In case of validation failure return false. */

public class UserName_Validation {

	public static void main(String[] args) 
	{

		String username = "EktaValhe_job";
		if(userNameValidation(username.toLowerCase())) {
			System.out.println("Success...username is entered as per T&C");
		}else{
			System.out.println("please Enter proper username, check T&C");
		};
	}

	private static boolean userNameValidation(String s) {

		int n = s.length();
		String check = "_job";
		StringBuilder sb = new StringBuilder();
		if(n<12) {
			return false;
		}else 
		{
			sb.append(s.charAt(n-4)).append(s.charAt(n-3)).append(s.charAt(n-2)).append(s.charAt(n-1));
			if(!check.equals(sb.toString())) {
				return false;
			}
		}
		return true;
	}

}
