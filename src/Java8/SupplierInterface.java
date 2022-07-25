package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterface {


    public static void main(String[] args) {


        Supplier<String> supplier = () -> "Hi, Vimal";
        System.out.println(supplier.get());


        List<String> foods  = Arrays.asList("Burger","Pizza","Noodles","Cake","Pasta","Rolls");
        System.out.println(foods.stream().findAny().orElseGet(() -> "Hi, Vimal"));
    }
}
