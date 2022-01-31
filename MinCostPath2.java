// This question is simple to understand

public class MinCostPath2 {

    static int min(int a , int b, int c) {
        if(a < b && a < c) {
            return a;
        }else if(b < a && b < c) {
            return b;
        }else if(c < a && c < b) {
            return c;
        }else {
            return a;
        }
    }

    static int minCost(int arr[][] , int n , int m) {
        
        int dp[][] = new int[n+1][m+1];

        dp[0][0] = arr[0][0];

        for(int i = 1; i <= n; i++){
            dp[i][0] = dp[i-1][0] + arr[i][0];
        }

        for(int j = 1; j <= m; j++) {
            dp[0][j] = dp[0][j-1] + arr[0][j];
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                dp[i][j] = min(
                    minCost(arr, n-1, m-1) , minCost(arr, n-1, m) , minCost(arr, n, m-1)
                ) + arr[i][j];
            }
        }

        return dp[n][m];

        
    }

    public static void main(String[] args) {
        int arr[][] = {{9 , 6 , 4}, {4 , 8 , 5} , {3 , 9 , 6}};
        int n = arr.length - 1;
        int m = arr.length - 1;

        System.out.println(minCost(arr, n , m ));
    }
}
