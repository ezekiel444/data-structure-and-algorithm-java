package DataStructureAndAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {
    long startTime;
    long endTime;
    long elapseTime;

    LinkedList<Integer> linkedList = new LinkedList<>();
    ArrayList<Integer> arrayList = new ArrayList<>();



    public LinkedListVsArrayList(){

        for(int i=0; i<1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }
//        LinkedList ****************************
        startTime = System.nanoTime();

        linkedList.get(0);
        linkedList.get(500000);
        linkedList.remove(999999);

        endTime = System.nanoTime();
        elapseTime = endTime - startTime;
        System.out.println("linkedList:\t" +elapseTime + "ns");

        //        LinkedList ****************************


        //       ArrayList ****************************

        startTime = System.nanoTime();

        arrayList.get(0);
        arrayList.get(500000);
        arrayList.remove(999999);

        endTime = System.nanoTime();
        elapseTime = endTime - startTime;
        System.out.println("arrayList:\t" +elapseTime + "ns");


        //       ArrayList ****************************
    }
}
