
// Easy code for Unbounded knapsack
// dp[] array is also printed take it as reference

public class UnboundedKnapsack {

    // Method for finding maximum profit
    static int knapsack(int W, int val[] , int wt[] , int n){

        int dp[] = new int[W+1];
        dp[0] = 0;
    
        for(int i = 0; i <= W; i++){
            for(int j = 0; j < n; j++){
                
                if(wt[j] <= i){
                    dp[i] = Math.max(dp[i] , dp[i - wt[j]] + val[j]);
                }
 
            }
        }

        return dp[W];
    }

    // Printing dp[] array that we created
    static void printKnapsack(int W, int val[] , int wt[] , int n){
        int dp[] = new int[W+1];

        dp[0] = 0;

        for(int i = 0; i <= W; i++){
            for(int j = 0; j < n; j++){
                
                if(wt[j] <= i){
                    dp[i] = Math.max(dp[i] , dp[i - wt[j]] + val[j]);
                }

            }
        }

        for(int k = 0; k <= W; k++){
            System.out.print(dp[k] + " ");
        }

    }

    
    public static void main(String[] args) {
        int W = 50;
        int val[] = {100, 300, 200};
        int wt[] = {8, 3, 6};
        int n = val.length;

        System.out.println(knapsack(W,val,wt,n));
        printKnapsack(W, val, wt, n);
    }
}
