package Algorithms;

public class SelectionSort {

    /*
     * Selection Sort
     * About - It compares the largest item with right item , If right item greater than the largest
     * item then right one become large and swap with last unsorted index.
     *
     * In place algorithm
     * O(n2) time complexity - quadratic
     * It takes 100 steps to sort 10 items ,10,000 steps to sort 100 items
     * Doesn't require as much swapping as bubble sort
     * Unstable algorithm
     *
     * */




    public static void main(String[] args)
    {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };



        for(int lastUnsortedIndex = intArray.length - 1;lastUnsortedIndex > 0;lastUnsortedIndex--)
        {
            int largest = 0;
            for(int i = 0; i <= lastUnsortedIndex;i++)
            {
                if(intArray[i] > intArray[largest])
                {

                    largest = i;

                }

                swap(intArray,largest,lastUnsortedIndex);
            }



        }

        for(int i = 0; i < intArray.length; i++)
        {
            System.out.println(intArray[i]);

        }

    }

    public static void swap(int[] array, int i, int j)
    {
        if(i == j)
        {
            return;

        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
