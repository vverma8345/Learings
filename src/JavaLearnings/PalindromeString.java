package JavaLearnings;

public class PalindromeString {

    public static void main(String[] args){

        String inputString  = "abca";
        String reverseString = "";

        if(inputString != null || inputString.length() != 0)
        {

            for (int i=inputString.length()-1;i>=0;i--)
            {

                reverseString =  reverseString + inputString.charAt(i);


            }

          if(inputString.equalsIgnoreCase(reverseString))
          {
              System.out.println("Given string is palindrome.");

          }
          else
          {

              System.out.println("Given string is not palindrome.");
          }
        }




    }
}
