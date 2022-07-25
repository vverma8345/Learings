package Java8;

@java.lang.FunctionalInterface
interface Calculator {

   /* void switchOn();

    void message(String name);

    */

    int substract(int a, int b);
}

public class Cisco {


    public static void main(String[] args) {

      /*

         Calculator calculator = () -> System.out.println("Switch On");
         calculator.switchOn();



        Calculator calculator = (name) -> System.out.println("Hello "+name);
        calculator.message("Vimal");

        Calculator calculator = (a,b) -> a - b;
        System.out.println(calculator.substract(2,3));


       */

        Calculator calculator = (a, b) ->
        {
            if (a < b) {
                throw new RuntimeException("a should be greater than b");

            } else {
                return a - b;

            }


        };

        System.out.println(calculator.substract(5, 4));

    }
}
