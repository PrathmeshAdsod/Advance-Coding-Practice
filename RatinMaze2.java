

// Something wrong in code

import java.util.ArrayList;
import java.util.List;

// Movement of Rat possible in All Directions

public class RatinMaze2 {    

    static List<String> pathList = new ArrayList<>();
    static String path = "";

    static boolean isSafe(int maze[][] , int row, int col , int n, boolean visited[][]){
        
        if(maze[row][col] == 0 ||row < 0 || row == maze.length || col < 0 || col == maze[0].length || visited[row][col])
        {
            return false;
        }

        return true;
    }

    
    static void travelMaze(int maze[][],int row,int col,int n){
        

        boolean visited[][] = new boolean[n][n];

        /*if(row == 0 && col == 0){
            // This means we are at starting position and we dont need to consider it 
            return;
        }*/

        // Base case
        if(row == n-1 && col == n-1) {
            pathList.add(path);
            return;
        }

        // Mark the cell on which you are as visited[][]
        visited[row][col] = true; // common for all the 4 if statements we created below that's why written above 

        if(isSafe(maze, row+1, col, n, visited)){
            path += 'D';
            // Then we will check recursively for all down positions
            travelMaze(maze, row+1, col, n);
            path = path.substring(0 , path.length()-1); // Backtrack
        }

        if(isSafe(maze, row, col-1, n, visited)){
            path += 'L';
            travelMaze(maze, row, col-1, n);
            path = path.substring(0, path.length()-1);  // Backtrack
        }
        if(isSafe(maze, row, col+1, n, visited)) {
            path += 'R';
            travelMaze(maze, row, col+1, n);
           path = path.substring(0, path.length()-1); // Backtrack
        }
        if(isSafe(maze, row-1, col, n, visited)){
            path += 'U';
            travelMaze(maze, row-1, col, n);
           path = path.substring(0, path.length()-1); // Backtrack
        }

       

        // Make it false for all other possibilities
        visited[row][col] = false;

    }


    public static void main(String[] args) {
        int maze[][] = {
            {1,1,0,0,1},
            {1,1,0,0,1},
            {1,1,1,0,1},
            {0,0,1,1,1},
            {0,0,1,1,1}
        };

        int n = maze.length;

        travelMaze(maze, 0, 0, n);

        for(int i = 0; i < pathList.size() ; i++){
            System.out.print(pathList.get(i) + " ");
        }
        
    }
}
