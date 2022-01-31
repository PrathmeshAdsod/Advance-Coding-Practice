
/*
The Longest Increasing Subsequence (LIS) problem is to
 find the length of the longest subsequence of a given 
 sequence such that all elements of the subsequence are sorted in increasing order.

 Note - : We have to find longest subsequence and in increasing order

*/

public class LongestIncreasingSubsequence {

    static int countLongest(int arr[] , int N) {

        int dp[] = new int[N];

        for(int i = 0; i < N; i++) {
            dp[i] = 1;
        }

        for(int i = 1; i < N; i++) {

            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        System.out.println("Printing DP Array : ");
        for(int k = 0; k < N; k++) {
            System.out.print(dp[k] + " ");
        }
        System.out.println();

        return dp[N-1];
    }

    public static void main(String[] args) {
        int arr[] = {50, 3, 10, 7, 40, 80};
//        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int N = arr.length;
      
        System.out.println("LIS is " +countLongest(arr, N));
        
    }

}