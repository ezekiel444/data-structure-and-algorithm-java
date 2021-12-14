package DataStructureAndAlgorithm;

public class CustomLinearSearch {


    public CustomLinearSearch() {
        int[] data = {2,52,4,5,8,7,1,88};
        int index = linearSearch(data, 7);
        if(index !=-1){
            System.out.println("Element found at " + index);
        }else {

        System.out.println("Element not found");
        }
    }
   int linearSearch(int[] array, int num){
        for (int i=0; i<array.length; i++){
            if(array[i] == num){
                return i;
            }
        }
        return -1;
    }
}
