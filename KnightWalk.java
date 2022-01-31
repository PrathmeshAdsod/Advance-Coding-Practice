// This Code is best

import java.util.LinkedList;
import java.util.Queue;

public class KnightWalk {

    // We have to store co-ordinates in the Queue 
    // that's why we are making custom class to store then
    // i.e it this class will simply store information of x and y co-ordinates 
    static class Coordinate {
        int x ,  y;
        Coordinate(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static boolean isValid(int x,int y,int N, int M){

        if(x < 0 || x >= N || y >= M || y < 0){
             return false;
        }

        return true;
    }

    
    // x1 , y1 are intial position
    // x2 , y2 are targeted position

    static int knight(int N , int M , int x1 , int y1, int x2 , int y2) {

        // if we are on i,j then in x-direction we can move is
        int dx[] = {-1,-2,-1,-2,1,2,1,2};
        // if we are on i,j then in y-direction we can move is
        int dy[] = {-2,-1,2,1,-2,-1,2,1};

        boolean visited[][] = new boolean[N+1][M+1];

        Queue<Coordinate> queue = new LinkedList<>();
        // First add source in queue
        queue.add(new Coordinate(x1, y1));
        // mark source as visited
        visited[x1][y1] = true;
        // initialize move_count as 0
        int move_count = 0;

        while( ! queue.isEmpty() ){
            int q_size = queue.size();

            for(int count = 0; count < q_size; count++){

                // Value of Coordinates x,y will pass 
                // in currPosition which we removed from Queue
                Coordinate currPosition = queue.remove();

                if(currPosition.x == x2 && currPosition.y == y2){
                    return move_count;
                }

                // i < 8 becoz  Knight can walk in 8 directions so from 0...7
                for(int i = 0; i < 8; i++){

                if(isValid(currPosition.x + dx[i] , currPosition.y + dy[i] , N, M) 
                    && ! visited[currPosition.x + dx[i]][currPosition.y + dy[i]]) {

                        queue.add(new Coordinate(currPosition.x + dx[i], currPosition.y + dy[i]));

                        visited[currPosition.x + dx[i]][currPosition.y + dy[i]] = true ;

                    }     
                        
                }
            }
            move_count++;

        }



        return -1; // if destination can't be found
    } 

    public static void main(String[] args) {
        int N = 4;
        int M = 4;
        // 7 * 5 = 35   i.e board will be of N cross(*) M

        int x1 = 1 , y1 = 1;
        int x2 = 2 , y2 = 1;

        System.out.println(knight(N, M, x1, y1, x2, y2));
    }
}
