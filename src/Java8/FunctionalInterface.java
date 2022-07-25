package Java8;

@java.lang.FunctionalInterface
public interface FunctionalInterface {

    /*
     * Functional Interface
     *
     * The interface who contains only one abstract method but can have multiple default and static method
     * is called functional interface
     *
     * Ex:
     *   Runnable --->  run()
     *   Callable ---> call()
     *   Comparable ---> compareTo()
     *   Comparator ---> compare()
     *
     * */

    /*
     * Consumer Interface
     * Consumer<T>  is built-in functional interface in java 8.
     * Consumer can be used in all contexts where an object needs to be consumed
     * i.e taken as input, and some operation is to be performed on the onbject without returning any result
     *
     * void accept(Tt);
     *
     * Predicate Interface
     * This function interface used for conditional check
     * where we think , we can use these true/false returning functions in day to day
     * programming we should choose predicate
     *
     * boolean test(Tt);
     *
     *Supplier Interface
     * Supplier can be used in all contexts where there is no input but output is expected.
     *
     * T get();
     *
     * */

    void method();

    default void method1() {
        System.out.println("default method 1");
    }

    default void method2() {

        System.out.println("default method 2");
    }

    static void method3() {
        System.out.println("static method 3");
    }

    static void method4() {
        System.out.println("static method 4");
    }

}
