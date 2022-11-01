import java.util.Scanner;

public class Parkway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int z = 1; z <= T; z++) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int rest = 0;
            int i = 0;
            while (i < n) {
                if (arr[i] <= m) {
                    m -= arr[i];
                    i++;
                } else {
                    rest += (arr[i] - m);
                    m = arr[i];
                }

            }
            System.out.println(rest);

        }
    }
}
