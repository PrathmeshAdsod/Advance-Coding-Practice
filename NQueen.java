
//Someting is wrong in code
// isSafe function is wrong

public class NQueen {
    

    static boolean isSafe(int board[][] , int row , int col){
        int N = board.length;
         // Horizontal
         for(int j = 0; j < N; j++){
            if(board[j][row] == 1){
                return false;
            }
         }

         // Vertical
         for(int i = 0; i < N; i++){
            if(board[col][i] == 1){
                return false;
            }
         }

         // Upper left diagonal
         int r = col;
         for(int c = row; r >= 0 && c >= 0; c--, r--){
             if(board[c][r] == 1){
                 return false;
             }
         }

         // Upper Right diagonal
         r = col;
         for(int c = row; row < board.length && c>= 0; c--,r++){
            if(board[c][r] == 1){
                return false;
            }
         }

         // Lower left diagonal
         r = col;
         for(int c = row; row >= 0 && r < board.length; r++,c--){
            if(board[c][r] == 1){
                return false;
            }
         }

         // Lower right diagonal
         r = col;
         for(int c = row; row < board.length && r >= 0; r++,c++){
            if(board[c][r] == 1){
                return false;
            }
         }

         return true;
    }

    static boolean queen(int board[][] , int row , int N){
         if(row == N){
            return true;
         }
        
         for(int col = 0; col < N ; col++){
             if(isSafe(board,row,col)){
                 board[row][col] = 1;

                 if(queen(board,row+1,N)){
                     return true;
                 }
                 board[row][col] = 0;
             }

         }
        return false;
    }

    static void printSolution(int board[][] , int N)
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                                 + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int board[][] = { { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 } };
        int N = board.length;
        int row = board[0].length;

        if(queen(board, row, N)){
            printSolution(board, N);
        }

        
        
    }
}
