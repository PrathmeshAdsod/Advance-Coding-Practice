import java.util.Arrays;
import java.util.Scanner;

public class Promo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mat[][] = new int[q][2];
        for (int i = 0; i < q; i++) {
            mat[i][0] = sc.nextInt();
            mat[i][1] = sc.nextInt();
        }

        Arrays.sort(arr);
        int k = 0, l = arr.length - 1;
        while (k <= l) {
            int temp = arr[k];
            arr[k] = arr[l];
            arr[l] = temp;
            k++;
            l--;
        }

        for (int i = 0; i < q; i++) {
            int x_items = mat[i][0] - 1;
            int y_query = mat[i][1] - 1;
            // System.out.println(y_query);
            int ans = 0;
            int item = 0;
            while (item++ <= y_query) {
                ans = ans + arr[x_items--];
            }
            System.out.println(ans);
        }

    }
}
