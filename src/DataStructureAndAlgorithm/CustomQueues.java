package DataStructureAndAlgorithm;


// *******************************************************

// Queue = FIFO data structure. First-In First-Out
//                A collection designed for holding elements prior to processing
//                Linear data structure

//      enqueue = offer() means to add
//      dequeue = poll() means to remove

// Where are queues useful?

// 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
// 2. Printer Queue (Print jobs should be completed in order)
// 3. Used in LinkedLists, PriorityQueues, Breadth-first search

// *******************************************************

import java.util.LinkedList;
import java.util.Queue;

public class CustomQueues {
   public CustomQueues(){

       Queue queue = new LinkedList();

       queue.offer("love");
       queue.offer("happy");

       System.out.println(queue.poll());

    }
}
