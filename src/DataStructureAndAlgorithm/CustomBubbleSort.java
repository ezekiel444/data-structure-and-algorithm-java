package DataStructureAndAlgorithm;

import java.util.ArrayList;

// bubble sort = pairs of adjacent elements are compared, and the elements
//  swapped if they are not in order.

//  Quadratic time O(n^2)
//  small data set = okay-ish
//  large data set = BAD (plz don't)

public class CustomBubbleSort {
    int[] array = {2,48,8,7,9,6,3,15,1,5};

    public CustomBubbleSort() {
        bubbleSort(array);
        for (int num:array) {
            System.out.print(num + " ");
        }
    }

   void bubbleSort(int[] numbersArray){
        for(int i =0; i<numbersArray.length; i++){
            for(int j=0; j<numbersArray.length - i -1; j++){
                if(numbersArray[j] > numbersArray[j + 1]){
// if statement  '<': decending order sort, || '>' : accending order sort
                    int temp = numbersArray[j];
                    numbersArray[j] = numbersArray[j + 1];
                    numbersArray[j + 1] = temp;
                }

            }
       }
    }

}
