package DataStructureAndAlgorithm;

// Insertion sort = after comparing elements to the left,
//    shift elements to the right to make room to insert a value

//     Quadratic time O(n^2)
//     small data set = decent
//     large data set = BAD

//     Less steps than Bubble sort
//     Best case is O(n) compared to Selection sort O(n^2)


public class CustomInsertionSort {
    int array[] = {5,7,9,2,1,5,0,3,6,8};

    public CustomInsertionSort() {

        insertionSort(array);

        for(int i:array){
            System.out.print(i + " ");
        }
    }
    void insertionSort(int[] NumbersArray){

        for (int i = 1; i<NumbersArray.length; i++){
            int temp = NumbersArray[i];
            int j = i - 1;

            while (j >= 0 && NumbersArray[j] > temp){
                NumbersArray[j + 1] = NumbersArray[j];
                j--;
            }
            NumbersArray[j +1] = temp;
        }
    }
}
