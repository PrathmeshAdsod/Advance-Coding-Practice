
// Code work perfectly
// Congo i solved it on my own without any help

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrranges{

    static class Coordinates {
        int x , y;

        Coordinates(int x,int y) {
            this.x = x;
            this.y = y;
        }
    }

    static boolean isSafe(int oranges[][] ,int x , int y) {

        if(x < 0 || x >= oranges.length || y < 0 || y >= oranges[0].length) {
            return false;
        }
        return true;

    }

    static int rottenOranges(int oranges[][] , int rows , int cols) {

        
        int time = 0;
        Queue<Coordinates> queue = new LinkedList<Coordinates>();
        int i;
        int j;
        for(i = 0; i < rows; i++){
            for(j = 0; j < cols; j++){
                if(oranges[i][j] == 2) {
                    queue.offer(new Coordinates(i, j));
                }
            }
        }
        // We are calculating time smartly thats why we took size before while loop
        int size = queue.size(); // we took size of queue first outside while loop

        while( ! queue.isEmpty()) {

            Coordinates item = queue.poll();
            size--;

            if(isSafe(oranges, item.x + 1, item.y) && oranges[item.x+1][item.y] == 1) {
                oranges[item.x + 1][item.y] = 2;
                queue.offer(new Coordinates(item.x + 1, item.y));
            }

            if(isSafe(oranges, item.x - 1, item.y) && oranges[item.x-1][item.y] == 1) {
                oranges[item.x - 1][item.y] = 2;
                queue.offer(new Coordinates(item.x - 1, item.y));
            }

            if(isSafe(oranges, item.x, item.y + 1) && oranges[item.x][item.y + 1] == 1) {
                oranges[item.x][item.y + 1] = 2;
                queue.offer(new Coordinates(item.x, item.y + 1));
            }

            if(isSafe(oranges, item.x, item.y - 1) && oranges[item.x][item.y - 1] == 1) {
                oranges[item.x][item.y - 1] = 2;
                queue.offer(new Coordinates(item.x, item.y - 1));
            }

            if(size == 0) {
                time++;
                // if size is 0 of queue that means one time interval is done and do
                // another time interval
                // thats why we restored size of queue at present
                // and start another time interval
                size = queue.size();
            }
            
        }
        
        for(int k = 0; k < rows; k++){
            for(int l = 0; l < cols; l++){
                if(oranges[k][l] == 1) return -1;
            }
        }
        /*
        At last time frame when few last oranges also rotten then we don't have another
        oranges to be wrote but last few oranges which are rotten recently we are 
        adding them in queue also and they will also be execute according to code we 
        write above in while loop
        That's why that extra time which we are wasting to check another oranges if not 
        rotten we are checking it unnecessary becoz all oranges are rotten and our
        code dont know it present in while loop
        Thats why we will remove 1 last unnecessary timeFrame from our main time 
        */

        return time - 1;
    }

    public static void main(String[] args) {
      /*   int oranges[][] = { { 2, 1, 0, 1, 1 },
                             { 0, 0, 1, 1, 1 },
                             { 1, 2, 0, 2, 0 }
                           }; */
            int oranges[][] = {
                {2,2,2,1},
                {1,2,0,1},
                {2,2,0,1}
            };               
          int rows = oranges.length;
          int cols = oranges[0].length;                 

          System.out.println("Timeframe required to rott all oranges : "+rottenOranges(oranges, rows, cols));

    }
}