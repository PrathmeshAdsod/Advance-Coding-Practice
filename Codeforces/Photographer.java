import java.util.Arrays;
import java.util.Scanner;

public class Photographer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int z=1; z<=T; z++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr[] = new int[2*n];
            for(int i=0; i < 2*n; i++) {
                arr[i] = sc.nextInt();
            }
           
            Arrays.sort(arr);
             String ans = "YES";
            for(int i=0 ,j = n; i < n; i++ , j++) {
                  if((arr[j] - arr[i]) < x) {
                    ans = "NO";
                    break;
                  }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
