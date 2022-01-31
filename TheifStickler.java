public class TheifStickler {

    static int helpTheif(int arr[] , int n){

/* In this problem take or don't take concept is used */
        
        // Base Cases for Optimization
        if( n == 0) return n;
        if( n == 1) return arr[1];
        if( n == 2) return Math.max(arr[0], arr[1]);

        int dp[] = new int[n];

        dp[0] = arr[0];
        dp[1] = Math.max(arr[0] , arr[1]);

        for(int i = 2; i < n; i++){
            dp[i] = Math.max(arr[i] + dp[i-2] , dp[i-1]);
        }

        return dp[n-1];

    }

    public static void main(String[] args) {
        int arr[] = {50,90,200,400,100};
        int n  = arr.length;

        System.out.println(helpTheif(arr, n));
    }
}
