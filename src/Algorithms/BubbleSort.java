package Algorithms;

public class BubbleSort {

    /*
    * Bubble Sort
    * About - It compares the left item with right item , If right one greater than left one then swap it.
    *
    * In place algorithm
    * O(n2) time complexity - quadratic
    * It takes 100 steps to sort 10 items ,10,000 steps to sort 100 items
    * stable algorithm
    *
    * */
  public static void main(String[] args){

      int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

      for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex-- ){

          for( int i = 0; i < lastUnsortedIndex; i++)
          {
              if(intArray[i] > intArray[i + 1] )
              {
                  sawp(intArray, i, i + 1);
              }

          }


      }

      for(int i = 0; i < intArray.length; i++)
      {
          System.out.println(intArray[i]);

      }



  }

  public static void sawp(int[] array,int i ,int j)
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



