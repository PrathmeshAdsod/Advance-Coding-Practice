// Go to https://www.techiedelight.com/rod-cutting/

public class RodCutting2 {


    static int rodCut(int price[] , int n){

        int dp[] = new int[n + 1];

        for(int i = 1; i <= n; i++){

            // divide the rod of length `i` into two rods of length `j`
            // and `i-j` each and take maximum
            for(int j = 1; j <= i; j++){

                dp[i] = Math.max(dp[i] , price[j-1] + dp[i-j]);

            }
        }

        return dp[n];

    }

    
    public static void main(String[] args) {
        int[] price = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int n = 4;        // rod length
 
        System.out.print("Profit is " + rodCut(price, n));
    }
}
