package DataStructureAndAlgorithm;

// merge sort = recursively divide array in 2, sort, re-combine
// run-time complexity = O(n Log n)
// space complexity    = O(n)

public class CustomMergeSort {
    int[] Data_array = {2,8,7,56,4,9,4,2,9,5,0,2,4};
    public CustomMergeSort() {

        mergeSort(Data_array);
        for (int i:Data_array) {
            System.out.print(i + " ");
        }
    }
    void mergeSort(int[] NumbersArray){
        int length = NumbersArray.length;
        if(length <= 1) return; // base case
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //index for leftArray
        int j = 0; //index for rightArray

        for(; i<length; i++){
            if(i < middle){
                leftArray[i] = NumbersArray[i];
            }else {
                rightArray[j] = NumbersArray[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,NumbersArray);
    }

    void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, r = 0, l = 0; //indices for array,right,left
//        checking condition for merging
        while (l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] =leftArray[l];
                i++;
                l++;
            }else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
