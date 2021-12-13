package DataStructureAndAlgorithm;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
//import java.util.Queue;


//Priority Queue = A FIFO data structure that serves elements
// with the highest priorities first
// before elements with lower priority
//Strings in default order
//Strings in reverse order
//Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());


public class CustomPriorityQueue {

   public CustomPriorityQueue(){
        Queue<Double> queue = new PriorityQueue<Double>((a,b)-> (int) (b -a));

        queue.offer(0.5);
        queue.offer(8.2);
        queue.offer(6.4);
        queue.offer(7.4);
        queue.offer(2.1);
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
