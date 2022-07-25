package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {

    public static void main(String[] args) {


        /*
        Predicate<Integer> predicate = t -> t % 2 == 0;
        System.out.println(predicate.test(5));

         */



        List<Integer> numbers = Arrays.asList(12,20,55,7,-10);
        numbers.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("Print even numbers: " + t));
    }




}
