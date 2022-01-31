public class OptimalStrategyGame {

    static int myStrategy(int arr[] , int n) {
        
        int dp[][] = new int[n][n];

        /*
        Here gap(g) means gaps in value
        e.x if value is single then g = 0
        e.x if gaps in value is 1 i.e if we have to select from 8 and 7
             then g = 1
        e.x if gap is more than 1 i.e if we have to select from 8,15,7 or 8,15,2,7 etc
            then g > 1     
        */

        for(int g = 0; g < n; g++){
            
            for(int i = 0 , j = g; j < n; i++, j++){

                // Diagonal 1
                if(g == 0){
                    dp[i][j] = arr[i]; //in first diagonal all values will be as it is
                    // e.x in dp[2][2] the value will be arr[2]
                    // e.x in dp[3][3] the value will be arr[3]
                }
                // Diagonal 2
                else if(g == 1){
                    dp[i][j] = Math.max(arr[i] , arr[j]);
                    // e.x in arr[0] , arr[3] take max
                }
                // Remaining
                else {
                    int val1 = arr[i] + Math.min(dp[i+2][j] , dp[i+1][j-1]);
                    int val2 = arr[j] + Math.min(dp[i+1][j-1] , dp[i][j-2]);

                    dp[i][j] = Math.max(val1 , val2);
                }

            }
        }

        return dp[0][n-1];

    }


    public static void main(String[] args) {
        int arr[] = { 20, 30, 2, 2, 2, 10 };
        int n = arr.length; 
        
        System.out.println(myStrategy(arr, n));

    }
}