

import java.util.ArrayList;

// First Solution of Simple Rat in Maze problem

public class RatInMaze {

    static ArrayList<String> pathList = new ArrayList<>();
    static String path = "";

    static boolean isSafe(int maze[][] , int rows , int cols ,int n){

        if(rows < 0 || cols < 0 || cols >= maze[0].length || rows >= maze.length ||maze[rows][cols] == 0 ) {
             return false;
        }

        return true;
    }
 

    static void travelMaze(int maze[][] , int rows , int cols ,int n) {


        if(rows == n-1 && cols == n-1) {
            pathList.add(path);
            return;
        }

        if(isSafe(maze, rows, cols, n)){
            // First check all possibilities in Down direction
            // with the help of recursion
            path += 'D';
            travelMaze(maze, rows+1, cols, n);
            // If further going down dont give answer or not safe
            // then dont consider that down and backtrack
            // and dont go further
            path = path.substring(0 , path.length() - 1); // Backtrack

            // Then check all possibilities for Right direction
            // with help of recursion
            path += 'R';
            travelMaze(maze, rows, cols+1, n);
            // If further going right dont give answer or not safe
            // then dont consider that right and backtrack
            // and dont go further
            path = path.substring(0, path.length()-1); // Backtrack
        }

    }

    public static void main(String[] args) {
     /*   int maze[][] = {
            {1,1,0,0,1},
            {1,1,0,0,1},
            {1,1,1,0,1},
            {0,0,1,1,1},
            {0,0,1,1,1}
        };*/
        int maze[][] = {
            {1,0,0,0},
            {1,1,0,0},
            {1,1,1,0},
            {0,0,1,1}
        };

        int n = maze.length;

        travelMaze(maze, 0, 0, n);

        for(int i = 0; i < pathList.size() ; i++){
            System.out.print(pathList.get(i) + " ");
        }
        
    }
}
