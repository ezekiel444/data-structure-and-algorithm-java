package DataStructureAndAlgorithm;

public class CustomSelectionSort {

    int[] arary = {2,4,7,9,3,8,3};

    public CustomSelectionSort() {
        selectionSort(arary);
        for (int i:arary) {
            System.out.print(i + " ");
        }
    }

    void selectionSort(int[] numbersArray){
         for (int i = 0; i < numbersArray.length; i++){
             int min = i;
             for (int j = i +1; j<numbersArray.length; j++){
                 if(numbersArray[min] > numbersArray[j]){
                     min = j;
                 }
             }
             int temp = numbersArray[i];
             numbersArray[i] = numbersArray[min];
             numbersArray[min] = temp;
         }
    }

}
