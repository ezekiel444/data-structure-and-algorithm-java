package DataStructureAndAlgorithm.AdjacencyList;

import java.util.*;

// Adjacency List = An array/arraylist of linkedlists.

// Each LinkedList has a unique node at the head.
//	All adjacent neighbors to that node are added to that node's linkedlist
//	runtime complexity to check an Edge: O(v)
//	space complexity: O(v + e)


public class Graph {
    ArrayList<LinkedList<Node>> alist;

    public Graph(int size){
        alist = new ArrayList<>();
    }

    public void addNode(Node node){
        LinkedList<Node> currentlist = new LinkedList<>();
        currentlist.add(node);
        alist.add(currentlist);
    }
    public void addEdge(int src, int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);
    }
    public boolean checkEdge(int src, int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        for(Node node:currentList){
            if(node==dstNode){
                return true;
            }
        }
        return false;
    }
   public void print(){
     for(LinkedList<Node> currentlist:alist){
         for(Node node:currentlist){
             System.out.print(node.data + "-> ");
         }
         System.out.println();
     }

    }


}
