import java.util.*;
public class WalkerBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int z = 1; z <= t; z++) {
            int m = sc.nextInt() , n = sc.nextInt() , p = sc.nextInt();
            int arr[][] = new int[m][n];
            sc.nextLine();
            for(int i = 0; i < m; i++) {
                String str[] = sc.nextLine().split(" ");
                for(int j = 0; j < n; j++)
                    arr[i][j] = Integer.valueOf(str[j]);
            }
            int ans = 0;
            p -= 1;
            for(int i = 0; i < n; i++) {
                int john = arr[p][i];
                int max = 0;
                for(int j = 0; j < m; j++) {
                    if(j == p) continue;
                    max = Math.max(max , arr[j][i]);
                }
                if(john < max)
                   ans += Math.abs(john - max);
            }

            System.out.println("Case #"+z+": "+ans);


            
        }
    }
}
