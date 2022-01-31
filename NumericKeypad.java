
// This code is best and work very fine

public class NumericKeypad {

    static int count(int n){
        int keypad[][] = {
            {0,8},
            {1,2,4},
            {2,3,1,5},
            {3,2,6},
            {1,4,5,7},
            {2,4,5,6,8},
            {3,5,6,9},
            {4,7,8},
            {5,7,8,9,0},
            {6,8,9}
        };

        int dp[][] = new int[n+1][10];

        for(int i = 0; i < 10; i++) {
            dp[0][i] = 0;
        }

        // if  n = 2 -- i will go from 1 to 2
        for(int i = 1; i <= n ; i++) {
            for(int j = 0; j < 10; j++) {

                if(i == 1) {
                    dp[i][j] = 1;
                }else {
                    for(int k : keypad[j]) {
                        dp[i][j] += dp[i-1][k];
                    }
                }

            }
        }
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum += dp[n][i];
        }

        System.out.println("DP Array is : ");
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Total count is : ");

        return sum;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(count(n));
        

    }
}
