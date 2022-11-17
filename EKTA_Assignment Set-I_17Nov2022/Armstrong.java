package Java_Assignment;
/* Write a Java Program to check an armstrong number */

public class Armstrong {

    public static void main(String[] args) {

        int number = 1634, originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;
        /*
         * Checking for 3 digit number:
          while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
         */

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}