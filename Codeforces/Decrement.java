
import java.util.Scanner;

public class Decrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        // for (int z = 1; z <= T; z++) {

        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        if (n == 1 && arr1[0] > arr2[0]) {
            System.out.println("YES");
            return;
        }
        int diff = arr1[0] - arr2[0];
        for (int i = 1; i < n; i++) {
            if (arr1[i] > 0 && arr2[i] > 0 && diff != arr1[i] - arr2[i]) {
                System.out.println("NO");
                return;
            } else if (arr1[i] == 0 && arr1[i] > diff) {
                System.out.println("NO");
            }
        }
        System.out.println("YES");

        // }
    }
}
