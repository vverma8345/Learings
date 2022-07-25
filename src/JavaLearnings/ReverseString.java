package JavaLearnings;

public class ReverseString {

   // This program reverse the string

    String revStr = "";
    public static void main(String[] args)
    {
        ReverseString rs = new ReverseString();
       System.out.println(rs.reverseStr("MikeTyson"));

    }

    public  String reverseStr(String str)
    {
       if(str != null || str.length() != 0)
       {
           for(int i=str.length()-1;i>=0;i--){

                revStr = revStr + str.charAt(i);

           }

       }


        return revStr;
    }

}
