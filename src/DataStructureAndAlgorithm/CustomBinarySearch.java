package DataStructureAndAlgorithm;

import java.util.Arrays;


// binary search = Search algorithm that finds the position

// of a target value within a sorted array.

// Half of the array is eliminated during each "step"

public class CustomBinarySearch {
    int[] array =new int[1000];
    int target = 400;

    public CustomBinarySearch() {

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

       int index = customSearch(array,target);
        if(index == -1){
            System.out.println("Element not found" + target);
        }else {
            System.out.println("Element found at " + target);
        }


    }

  int customSearch(int[]userArray, int userTarget){
      int low = 0;
      int high = userArray.length;
      while (low <= high){
          int middle = low + (high - low)/2;
          int value = userArray[middle];
          System.out.println("middle " + middle);
          if(value < userTarget){
              low = middle + 1;
          }else if(value > userTarget){
              high = middle - 1;
          }else {
              return value;
          }
      }

        return -1;
    }

}
