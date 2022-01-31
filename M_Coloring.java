public class M_Coloring {
    static int V = 4;
    static int color[]; // for storing colors

    static boolean isSafe(int graph[][],int color[],int v,int i) {


        return true;
    }

    static boolean colorMe(int graph[][],int color[],int m,int i){
/* base case: If all vertices are
           assigned a color then return true */
           if (i == V)
           return true;

           for(int j = 1; j <= m; j++){
               
           }

        return false;
    }

    static boolean iAmColoring(int graph[][],int m){

        color = new int[V]; // By default all values will be 0

        if( !colorMe(graph, color, m, 0)) {
            System.out.println("No solution");
               return false;
        }
        for(int i = 0; i < V; i++){
            System.out.println(color[i] + " ");
        }
        System.out.println();
        return true;
    }

    public static void main(String[] args) {

        int graph[][] = {
            { 0, 1, 1, 1 },
            { 1, 0, 1, 0 },
            { 1, 1, 0, 1 },
            { 1, 0, 1, 0 },
        };

        int m = 3;

    }
};