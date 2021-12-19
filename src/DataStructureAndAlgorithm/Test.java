package DataStructureAndAlgorithm;

public class Test {
    int[] array = {2,8,7,9,6,4,1,25,3,4};
    public Test() {
        insertSeach(array);
        for (int i:array) {
            System.out.print(i + " ");

        }
    }

   void insertSeach(int[] NumbersArrar){

       for (int i = 1; i < NumbersArrar.length; i++) {
           int temp = NumbersArrar[i];
           int j = i -1;
           while ( j>=0 && NumbersArrar[j]>temp ){
               NumbersArrar[j + 1] = NumbersArrar[j];
               j--;
           }
           NumbersArrar[j + 1] = temp;
       }

    }
}
