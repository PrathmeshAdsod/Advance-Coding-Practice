
import java.util.*;
public class SnakeLadder {
    
    static class MyQueue {
        int v;
        int dist;
    }

    static int getMinThrows(int board[] , int n){
        boolean visited[] = new boolean[n+1];

        Queue<MyQueue> my_que = new LinkedList<>();
        
        MyQueue q = new MyQueue();

        q.v = 0;
        q.dist = 0;

        visited[0] = true;
        my_que.add(q);


        // BFS

        while( ! my_que.isEmpty()){
            q = my_que.remove();
            int v = q.v;

            if(v == n-1){
                break;
            }

            for(int j = v+1; j < (v+7) ; j++){
                if(visited[j] == false){
                   MyQueue a = new MyQueue();
                   a.dist = q.dist + 1;
                   visited[j] = true;

                   if(board[j] != -1){
                       a.v = board[j];
                   }else {
                       a.v = j;
                   }

                   my_que.add(a);
                }
            }
        }


return q.dist;
        
    }

    public static void main(String[] args) {
        
        int N = 30;
        int board[] = new int[N];
        for (int i = 0; i < N; i++)
            board[i] = -1;

        // Ladders
        board[2] = 21;
        board[4] = 7;
        board[10] = 25;
        board[19] = 28;

        // Snakes
        board[26] = 0;
        board[20] = 8;
        board[16] = 3;
        board[18] = 6;

        System.out.println(getMinThrows(board, N));


    }
}