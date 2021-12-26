package DataStructureAndAlgorithm;

import java.util.Random;

public class QuickSort2 {
    Random rand = new Random();
    int[] array = new int[10];

    public QuickSort2(){
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }

        System.out.println("Before:");
        printArray(array);

        quickSortArray(array,0, array.length -1);

        System.out.println("\n After:");
        printArray(array);
    }

    void quickSortArray(int[]numArray, int start, int end){
        if(end <= start) return;
        int pivot = partition(numArray, start, end);
        quickSortArray(numArray, start, pivot - 1);
        quickSortArray(numArray, pivot + 1, end);
    }

    private int partition(int[] numArray, int start, int end) {
        int pivot = numArray[end];
        int i = start - 1;
        for(int j = start; j<=end; j++){
            if(numArray[j] < pivot){
                i++;
                int temp = numArray[i];
                numArray[i] = numArray[j];
                numArray[j] = temp;
            }
        }
        i++;
        int temp = numArray[i];
        numArray[i] = numArray[end];
        numArray[end] = temp;

        return i;
    }




    private void printArray(int[]numArray){
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + " ");

        }
    }
}
