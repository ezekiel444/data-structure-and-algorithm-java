package DataStructureAndAlgorithm;

// stack = LIFO data structure. Last-In First-Out
//               stores objects into a sort of "vertical tower"
//    push() to add objects to the top
//    pop() to remove objects from the top

import java.util.Stack;

public class CustomStack {

    public CustomStack(){
        Stack<String> stack = new Stack<String>();

        stack.push("mary");
        stack.push("love");
        stack.push("john");
        stack.push("hane");
        stack.push("lucky");
        stack.push("hane");
        stack.push("hane");
//stack.pop();
//      for(int i=0; i<10000; i++){
//          stack.push("failout");
////        System.out.print(stack.search("hane"));
//      }
        System.out.println(stack);
    }



}
