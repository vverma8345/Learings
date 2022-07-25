package Java8;

import java.util.Arrays;
import java.util.List;

public class ConsumerInterface {

    public static void main(String[] args) {

        /*
        Consumer<String> consumer = t -> System.out.println("Hello "+t);
        consumer.accept("Vimal");

         */

        List<Integer> numbers = Arrays.asList(12,20,55,70,-10);


        numbers.stream().sorted().forEach(t -> System.out.println("Print Sorted Numbers: "+ t));

        numbers.stream().forEach(t -> System.out.println("Print Sorted Numbers: "+ t));

    }
}
