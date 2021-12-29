package DataStructureAndAlgorithm.AdjacencyMatrix;

import java.util.ArrayList;



// Adjacency Matrix = An array to store 1's/0's to represent edges

//		# of rows =    # of unique nodes
//		# of columns = # of unique nodes
//		 runtime complexity to check an Edge: O(1)
//		space complexity: O(v^2)


public class Graph {
    ArrayList<Node> nodes;
    int[][] matrix;

    public Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }
    public void addNode(Node node){
        nodes.add(node);
    }
    public void addEdge(int src,int dst){
        matrix[src][dst] = 1;
    }
    public boolean checkEdge(int src, int dst){
        if(matrix[src][dst] == 1){
            return true;
        }else {
            return false;
        }
    }

    public void print(){
        for(Node node:nodes){
            System.out.print(" ");
            System.out.print(node.data + " ");
        }
        System.out.println();

        for(int i = 0; i<matrix.length; i++){
            System.out.print(nodes.get(i).data + " ");
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // Depth First Search = Pick a route, keep going.
    // If you reach a dead end, or an already visited node,
    //	backtrack to a previous node with unvisited adjacent neighbors


    public void depthFirstSearch(int src){
        boolean[] visited = new boolean[matrix.length];
        dFShelper(src, visited);
    }

    private void dFShelper(int src, boolean[] visited) {
        if (visited[src]) {
            return;
        }else {
            visited[src] = true;
            System.out.println(nodes.get(src).data + " = visited");
        }

        for(int i=0; i< matrix[src].length; i++){
            if(matrix[src][i]==1){
                dFShelper(i,visited);
            }
        }
        return;
    }
}
