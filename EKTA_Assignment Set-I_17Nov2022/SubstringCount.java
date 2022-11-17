package Java_Assignment;
/*Input a string and a substring to be searched. 
  Count the number of occurances of the substring in the given string*/

public class SubstringCount {
	 
	    static int countFreq(String substr, String str)
	    {
	        int M = substr.length();
	        int N = str.length();
	        int res = 0;
	 
	        
	        for (int i = 0; i <= N - M; i++) {
	           
	            int j;
	            for (j = 0; j < M; j++) {
	                if (str.charAt(i + j) != substr.charAt(j)) {
	                    break;
	                }
	            }
	 
	           
	            if (j == M) {
	                res++;
	                j = 0;
	            }
	        }
	        return res;
	    }
	 
	   
	    static public void main(String[] args)
	    {
	        String str = "Ekta";
	        String substr = "a";
	        System.out.println(countFreq(substr, str));
	    }
	}