
// This code will only work if rod_size is equal to or less than prices length

// See RodCutting2 file that i created 

public class RodCutting {

    static int maxProfit(int prices[] , int rod_size){
        int max_val  = 0;
     
        int dp[] = new int[rod_size + 1];

        dp[0] = 0;

        System.out.print(dp[0]+" ");

        // fill dp[] with min_val
        for(int i = 1; i <= rod_size; i++){
            dp[i] = Integer.MIN_VALUE; 
        }

        for(int i = 1; i <= rod_size; i++){

             for(int j = 0; j < i; j++){

                 max_val = Math.max(max_val , prices[j] + dp[i-j-1]);

                 dp[i] = max_val;
             }

             System.out.print(dp[i] + " ");

        }
        System.out.println();

        

        return dp[rod_size];

    }

    public static void main(String[] args) {
        int prices[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int rod_size = 4;

        System.out.println(maxProfit(prices, rod_size));


    }
}