package DataStructureAndAlgorithm;

public class Test {
    int[] array = {2,8,7,9,6,4,1,25,3,4,1,99,8};
    public Test(){
        mergeSort(array);
        for (int num:array) {
            System.out.print(num + " ");
        }
    }
   void mergeSort(int[] numArray){
       int length = numArray.length;

       if(length<=1) return;

       int middle = length / 2;
       int[] leftArray = new int[middle];
       int[] rightArray = new int[length - middle];

       int j = 0;
       for(int i = 0; i<length; i++){
           if(i < middle){
               leftArray[i] = numArray[i];
           }else {
               rightArray[j] = numArray[i];
               j++;
           }

       }
       mergeSort(leftArray);
       mergeSort(rightArray);
       merge(leftArray,rightArray,numArray);
   }
   private static void merge(int[] leftArray, int[] rightArray, int[] arary){
        int leftSize = arary.length / 2;
        int rightSize = arary.length - leftSize;
        int i = 0, l = 0, r = 0;
        while(l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                arary[i] = leftArray[l];
                i++;
                l++;
            }else {
                arary[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l<leftSize){
            arary[i] = leftArray[l];
            i++;
            l++;
        }
        while (r<rightSize){
            arary[i] = rightArray[r];
            i++;
            r++;
        }
   }

//   void insertSeach(int[] NumbersArrar){
//
//       for (int i = 1; i < NumbersArrar.length; i++) {
//           int temp = NumbersArrar[i];
//           int j = i -1;
//           while ( j>=0 && NumbersArrar[j]>temp ){
//               NumbersArrar[j + 1] = NumbersArrar[j];
//               j--;
//           }
//           NumbersArrar[j + 1] = temp;
//       }
//
//    }
}
