
// Solution Works ! It is Great
// Topological Sort is Easy

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {

        int V;
        private static ArrayList<ArrayList<Integer>> adj;
        
        TopologicalSort(int V) {
            this.V = V;
            adj = new ArrayList<ArrayList<Integer>>(V);
            for(int i = 0; i < V; i++) {
                adj.add(new ArrayList<Integer>());
            }
        }

        void addEdge(int v,int w){
            adj.get(v).add(w);
        }

        static void topologicalSort(int V) {
             Stack<Integer> stack = new Stack<>();
             
             boolean visited[] = new boolean[V];
             // Fill boolean with false for default

             for(int i = 0; i < V ; i++){
                 if(visited[i] == false) {
                     visited[i] = true;
                     helperTopo( i , visited , stack);
                 }
             }


             while(!stack.isEmpty()) {
                 System.out.print(stack.pop() + " ");
             }
        }

        static void helperTopo(int i , boolean visited[] , Stack<Integer> stack){
       
           for(int x : adj.get(i)) {
                if(visited[x] == false) {
                    visited[x] = true;
                    helperTopo(x, visited, stack);
                }
            }
            stack.push(i);

        }
    

    public static void main(String[] args) {

        TopologicalSort g = new TopologicalSort(6);

        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        topologicalSort(6);
    }
}
