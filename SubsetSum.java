public class SubsetSum {

    static boolean isSum(int nums[] , int sum , int n){
        boolean dp[][] = new boolean[n+1][sum+1];

        // If sum is 0 then we can make it as subset
        for(int i = 0; i <= n; i++) {
             dp[i][0] = true; 
        }

        // Empty array except 0 can't make any subset
        for(int i = 1; i <= sum; i++) {
            dp[0][i] = false;
        }

        // Reamaining dp[][] filling
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sum; j++){
                
                if(dp[i-1][j])  // when we don't include current nums item)
                {
                    dp[i][j] = true;
                }
                else
                {
                    // if we include it
                    int val = nums[i-1]; // we are taking extra index in dp array so..
                    // j represents sum values which are columns in dp[][]
                    if(j >= val) {
                        if(dp[i-1][j-val]){
                            dp[i][j] = true;
                        }
                    }
                }
            }
        }

        


        return dp[n][sum];
    }

    public static void main(String[] args) {
        int nums[] = {2,3,7,8};
        int sum = 14;
        int n = nums.length;

        System.out.println(isSum(nums, sum, n));
        
    }
}
