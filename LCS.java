

public class LCS {

    static int lcsDp(char lcs1[] , char lcs2[], int n , int m) {

        int dp[][] = new int[n+1][m+1];

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= m; j++) {
                
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
                else if(lcs1[i - 1] == lcs2[j - 1]) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }

            }
        }

        // Printing DP Array : 
        System.out.println("Printing DP Array :");
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= m; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("LCS is : ");
        return dp[n][m];
    }



    public static void main(String[] args) {
        String str1 = "Jethalal";
        String str2 = "Popatlal";

        char lcs1[] = str1.toCharArray();
        char lcs2[] = str2.toCharArray();

        int n = str1.length();
        int m = str2.length();

        System.out.println(lcsDp(lcs1, lcs2, n, m));
    }
}
