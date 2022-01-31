
// Something is Wrong in this code
// and properly understand the Code

// In this example we will do searching of Word using Graph

public class WordSearch {
    

    static boolean patternSearch(char grid[][] , String word) {
        for(int R = 0; R < grid.length; R++){
            for(int C = 0; C < grid[0].length; C++){
                if((grid[R][C] == word.charAt(0) && dfs(grid,word,R,C,0))){
                     return true;
                }
            }
        }

        return false;
    }

    static boolean dfs(char grid[][] , String word , int R , int C,int count){

        // count will store length of word
        if(count == word.length()){
            return true;
        }

        // Check if element will not go out of grid
        if(R < 0 || C >= grid[0].length || R >= grid.length || C < 0
            || word.charAt(count) != grid[R][C] ) {
                return false;
            }

        char temp = grid[R][C];
        grid[R][C] = '/';
        
        boolean found = dfs(grid,word,R+1,C,count++) ||
                        dfs(grid,word,R-1,C,count++) ||
                        dfs(grid,word,R,C+1,count++) ||
                        dfs(grid,word,R,C-1,count++);

        grid[R][C] = temp; // Backtracking

        return found;
    }

    public static void main(String[] args) {
        
        char[][] grid = { { 'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S' },
                          { 'G', 'E', 'E', 'M', 'P', 'R', 'U', 'I', 'Z', 'G', 'E', 'E', 'K' },
                          { 'I', 'H', 'S', 'H', 'T', 'A', 'R', 'A', 'C', 'T', 'I', 'C', 'E' } };
        
        System.out.println(patternSearch(grid, "PRATHMESH"));
    }
}
