package JavaLearnings;

import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args)
    {
        System.out.println("Enter the number to get the factorial.");
        Scanner sn = new Scanner(System.in);
        Integer number = sn.nextInt();
        Integer factorial = 1;
        
        if(number != null) {


            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;


            }
            System.out.println("Factorial of " + number + " is " + factorial);


        }
    }
}
