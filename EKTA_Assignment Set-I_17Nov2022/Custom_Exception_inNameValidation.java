package Java_Assignment;

public class Custom_Exception_inNameValidation {

	public static void main(String[] args) 
	{
	String str1 = "Ekta valhe";
    String str2 = null;
    boolean res1=false;
    boolean res2=false;
    try {
    	if(str1.length()==0){
            str1.toLowerCase();
        }else {
        	System.out.println("First name : "+str1);
        }
    	
    }catch(Exception e) {
    	System.out.println("Exception caugth in fname..!Please try again");
    }
    try {
    	if(str2.length()==0){
            str2.toLowerCase();
        }else {
        	System.out.println("last name : "+str2);
        }
    }
    catch(Exception e)
    {
    	System.out.println("Exception caugth in lname..!Please try again");
    }
}
	}
