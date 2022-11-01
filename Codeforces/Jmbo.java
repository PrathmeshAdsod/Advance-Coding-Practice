import java.util.*;

public class Jmbo {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt() ; 
        for(int z = 1; z <= T; z++) {
            int n = sc.nextInt();
            sc.nextLine();
            int arr[][] = new int[n][2];
            int ans = 0;
            for(int i = 0; i < n; i++) {
                String s[] = sc.nextLine().split(" ");
                int a = Integer.valueOf(s[0]) , b = Integer.valueOf(s[1]);
                arr[i][0] = Math.min(a , b);
                arr[i][1] = Math.max(a , b);
            }

            Arrays.sort(arr , (a,b) -> a[1] - b[1]);
            for(int row[] : arr) 
                ans += 2 * row[0];
            
            for(int i = 1; i < n; i++) {
                ans += Math.abs(arr[i-1][1] - arr[i][1]);
            }
            ans += arr[0][1] + arr[n-1][1];
            System.out.println(ans);
        }
   }
}
