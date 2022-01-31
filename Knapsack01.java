
/*
   Learn this problem 
   We have printed DP[][] Array also
*/

public class Knapsack01 {

    static int knapSack(int W, int wt[], int val[], int n) {

        int dp[][] = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= W; j++) {

                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
                else if ( wt[i - 1] <= j ){
                    dp[i][j] = Math.max( dp[i-1][j] , dp[i-1][j - wt[i - 1]] + val[i - 1] );
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }

        }

        return dp[n][W];

    }

    static void printDP(int n , int W , int wt[] , int val[]){
        
        int dp[][] = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= W; j++) {

                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
                else if ( wt[i - 1] <= j ){
                    dp[i][j] = Math.max( dp[i-1][j] , dp[i-1][j - wt[i - 1]] + val[i - 1] );
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }

        }

        for(int k = 0; k <= n; k++){
            for(int l = 0 ; l <= W; l++){
                System.out.print(dp[k][l] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int wt[] = new int[] { 8, 6, 4 };
        int val[] = new int[] { 20, 40, 4 };
        int W = 12;
        int n = val.length;
        System.out.println("DP Array that we created is below :");
        printDP(n, W, wt, val);
        System.out.println("The maximum profit we can get using 0 /1 Knapsack is ");
        System.out.println(knapSack(W, wt, val, n));

    }

}