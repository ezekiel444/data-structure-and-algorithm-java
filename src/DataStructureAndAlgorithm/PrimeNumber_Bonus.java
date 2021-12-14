package DataStructureAndAlgorithm;

import java.util.ArrayList;

public class PrimeNumber_Bonus {

    public PrimeNumber_Bonus() {
        System.out.println(findPrime(50,100));
    }

   ArrayList<Integer> findPrime(int start, int end){
        ArrayList<Integer> arrayList = new ArrayList<>();
       for (int num = start; num < end; num++) {
           boolean prime = true;
           int initialValue = 2;
           while (initialValue <= num / 2){
              if(num % initialValue == 0){
                  prime = false;
                  break;
              }
              initialValue++;
           }
           if(prime){
               arrayList.add(num);
           }
       }
      return arrayList;

    }
}
