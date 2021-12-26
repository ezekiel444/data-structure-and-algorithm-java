package DataStructureAndAlgorithm;

import java.util.Random;

// quick sort = moves smaller elements to left of a pivot.
//     recursively divide array in 2 partitions

// run-time complexity = Best case O(n log(n))
//                                        Average case O(n log(n))
//                                        Worst case O(n^2) if already sorted

// space complexity    = O(log(n)) due to recursion

public class QuickSort1 {
    Random rand = new Random();
    int[] array = new int[10];

    public QuickSort1() {
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000);
        }


        System.out.println("Before sorting:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("\n After sorting:");
        printArray(array);
    }

    void quickSort(int[]randomArray, int startIndex,int endIndex){
        if(startIndex >= endIndex) return;
        int pivot = randomArray[endIndex];
        int leftPivot = startIndex;
        int rightPivot = endIndex;
        while (leftPivot < rightPivot){
            while (randomArray[leftPivot] <= pivot && leftPivot < rightPivot){
                leftPivot++;
            }
            while (randomArray[rightPivot] >= pivot && leftPivot < rightPivot){
                rightPivot--;
            }
            swap(randomArray, leftPivot, rightPivot);
        }
        swap(randomArray, leftPivot, endIndex);
        quickSort(randomArray, startIndex, leftPivot - 1);
        quickSort(randomArray, leftPivot + 1, endIndex);
    }

    void swap(int[] randomArray, int index1, int index2){
        int temp = randomArray[index1];
        randomArray[index1] = randomArray[index2];
        randomArray[index2] = temp;
    }




    void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
