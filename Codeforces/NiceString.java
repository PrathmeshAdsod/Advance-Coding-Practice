import java.util.*;

public class NiceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int dp[] = new int[n+1];
        boolean one = false;
        int ans = 0;
        int ones = 0;

        for(int i = 1; i <= n; i++) {

            if(str.charAt(i-1) == '1') {
                one = true;
                ones = ones + 1;
            }

            if(one) {
                dp[i] =  dp[i-1] + 1;
            }
            
        }
        for(int val : dp) {
            ans = ans + val;
        }

        System.out.println(ans+ones);
    }
}
