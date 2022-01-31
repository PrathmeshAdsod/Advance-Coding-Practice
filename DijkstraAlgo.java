
// Using Adjacency Matrix

// Drawback of Dijkstra Algorith --- 
// it can't handle if negative values are also there
// Djkstra works perfectly fine when positive values are there

/*
  For working of Below Dikstra algo code matrix must be of N*N
*/

public class DijkstraAlgo {

    static int findMinIndex(int distance[] , boolean visited[]){
        int minIndex = -1;
        for(int i = 0; i < distance.length ; i++){
            if( ! visited[i] && (minIndex == -1 || distance[i] < distance[minIndex] )){
                minIndex = i;
            }
        }
        return minIndex;
    }


    static void djkstra(int source , int distance[] , int arr[][]) {

        int n = arr.length;
        boolean visited[] = new boolean[n];

        //It's like Starter template for Djkstra Algo
        // making source as 0 and other distance as infinity i.e Integer.MAX_VALUE
        distance[source] = 0;  // min distance from source to source is 0
        for(int i = 0; i < n; i++){
            if(i == source) {
                continue;
            }

            distance[i] = Integer.MAX_VALUE;
        }
        
        //
        for(int i = 0; i < n; i++) {

            // Finding minimum value and marking it visited
            int minIndex = findMinIndex(distance , visited);
            visited[minIndex] = true;

            // After finding minimum value we will do following

            for(int j = 0; j < n; j++){
                if(arr[minIndex][j] != 0
                 && visited[j] == false 
                 && distance[minIndex] != Integer.MAX_VALUE){

                    int newDist = distance[minIndex] + arr[minIndex][j];
                    if(newDist < distance[j]){
                        distance[j] = newDist;
                    }
                }
                
            }
        }
    }

    public static void main(String[] args) {

        // Adjacency Matrix is used in this Problem

        int arr[][] = {
            {0,2,0,4,0,0},
            {0,0,3,2,0,0},
            {0,0,0,0,0,4},
            {0,0,0,0,2,0},
            {0,0,0,0,0,1},
            {0,0,0,0,0,0}
        };               
    

        int distance[] = new int[arr[0].length];        

        int source = 0;      

        djkstra(source, distance, arr);

        for(int i = 0; i < distance.length; i++){
            System.out.println( i +"   " + distance[i]);
        }

    }
}




/*        int arr[][] = { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                        { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                        { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                        { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                        { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                        { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                        { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                        { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                        { 0, 0, 2, 0, 0, 0, 6, 7, 0 } 
                       };       */
