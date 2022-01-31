
// Working code
// Shortest path to destination at undirected graph
// Weight of Undirected graph at every edge considered as 1

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestSourceToDestination {

    int V;
    private static ArrayList<ArrayList<Integer>> adj;

    ShortestSourceToDestination(int V) {
        this.V = V;
        adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int s, int d) {
        adj.get(s).add(d);
        adj.get(d).add(s);
    }

    static int shortestPath(ArrayList<ArrayList<Integer>> adj, int V, int source, int destination) {

        int minDistance = 0;

        if (source == destination) {
            return 0;
        }

        // Creating and Iniializing boolean visited array
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()) {

            int size = queue.size();

            while (size > 0) {
                int index = queue.poll();

                for (int x : adj.get(index)) {

                    if (x == destination) {
                        return ++minDistance;
                    }
                    if (visited[x] == false) {
                        visited[x] = true;
                        queue.add(x);
                    }

                }
                size--;
            }
            minDistance++;

        }

        return -1;
    }

    // Adjacency List is used in this Problem
    public static void main(String[] args) {
        ShortestSourceToDestination g = new ShortestSourceToDestination(6);

        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(3, 4);
        g.addEdge(2, 4);
        g.addEdge(4, 5);

        int source = 0;
        int destination = 5;

        System.out.println(shortestPath(adj, 6, source, destination));

    }
}