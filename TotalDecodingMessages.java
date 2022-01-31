public class TotalDecodingMessages {

   // Recursive Solution
    static int decoding(char digits[] , int n){

        if(n == 0 || n == 1) return 1;

        if(digits[0] == 0)  return 0;

        int count = 0;

        if(digits[n-1] > '0') count = decoding(digits, n-1);

        if(digits[n-2] == '1' 
           || ( digits[n-2] == '2' && digits[n-1] < '7')) {

           count = count + decoding(digits, n-2);

        }
        
        return count;

    }

    // Soluton with Dynammic Programming
    static int decodingWithDP(char digits[] , int n){
        int dp[] = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){

            dp[i] = 0;
           
            if(digits[i - 1] > '0'){
                dp[i] = dp[i-1];
            }

            if(digits[i - 2] == '1'
               ||  ( digits[i - 2] == '2' && digits[i - 1] < '7' ) ){
                   dp[i] = dp[i] + dp[i - 2];
            }

        }

        System.out.println("Printing DP Array");
        for(int k = 0; k <= n; k++){
            System.out.print("\n"+dp[k]+ " ");
        }

        return dp[n];
    }

    public static void main(String[] args) {
        char digits[] = {'1','2','1','4'};
        int n = digits.length;
        System.out.println("Using Recursion  "+ decoding(digits, n));
        System.out.println("Using Dynammic Programming "+decodingWithDP(digits, n));
    }
}


