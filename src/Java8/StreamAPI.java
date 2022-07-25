package Java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamAPI {

    /*
       Stream API used to process collections of objects.

       A stream is a sequence of object that support various methods, which can be
       pipelined to produce the desired result.

       A stream is not a data structure instead it takes input from the Collection, Array or IO channels.

       Streams don't change the original data structure, they only provide the result as per the pipelined methods.

       Why we need stream.?
       1. Function programing (Support function interface)
       2. Code reduce by using lambda
       3. Bulk operation

       Stream Methods:
       Filter --> for conditional check
       ForEach --> for Iteration
     */


    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Brown");
        colors.add("White");
        colors.add("Black");




        //StreamAPI.normalMethod(colors);
        // StreamAPI.lambdaMethod(colors);

        Map<String, Integer> products = new HashMap<String, Integer>();
        products.put("Macbook", 200);
        products.put("Macbook Pro", 100);
        products.put("IMac", 50);
        products.put("Iphone 13 Pro", 100);
        products.put("IPad", 40);

        //   products.forEach((k,v) -> System.out.println(k+" "+v));
        //  products.entrySet().stream().forEach(t -> System.out.println(t));


        // Filter method -- --for conditional check

        // Normal Approach
        for(String color : colors)
        {
            if(color.startsWith("B"))
            {
            System.out.println(color);
            }


        }

        //lambda Approach

        colors.stream().filter((t) -> t.startsWith("B")).forEach(t -> System.out.println(t));

        products.entrySet().stream().filter(k -> k.getKey()=="Macbook").forEach(obj -> System.out.println(obj));


    }

    public static void normalMethod(List<String> list) {

        for (String Item : list) {
            System.out.println(Item);
        }
    }

    public static void lambdaMethod(List<String> list) {

        list.stream().forEach(t -> System.out.println(t));
    }


}
