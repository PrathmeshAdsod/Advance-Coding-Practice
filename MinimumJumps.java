
public class MinimumJumps{

    static int minJumps(int arr[] , int n){

        // Optimization
        if(arr[0] == 0 || n == 0){
            return -1;
        }

        int dp[] = new int[n];

        dp[0] = 0;

        for(int k = 1; k < n; k++){
            dp[k] = Integer.MAX_VALUE;
        }

        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < i; j++){

                if(i <= j + arr[j] &&  arr[j] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i] , dp[j] + 1);
                }

            }

        }

        // Printing dp[] 
        for (int k = 0; k < dp.length ; k++){
            System.out.print(dp[k] + " ");
        }
        System.out.println();

        return dp[n-1];  // Last Index of dp array dp[n-1]
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 1, 2, 3 };

        System.out.println("Minimum number of jumps to reach end is : "
                           + minJumps(arr, arr.length));
    }
}

