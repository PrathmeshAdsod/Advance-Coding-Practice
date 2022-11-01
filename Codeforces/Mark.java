import java.util.Arrays;
import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int mini[] = new int[n - 2];
        Arrays.fill(mini, Integer.MAX_VALUE);

        for (int i = 0; i < n - 2; i++) {

            int ele1 = arr[i];
            int ele2 = arr[i+1];
            int ele3 = arr[i+2];
            int total = ele1 * ele2 * ele3;
            mini[i] = Math.min(mini[i], total);

        }

  

    int minval = Integer.MAX_VALUE;
    for(int i = 0;i<mini.length;i++)
    {
        minval = Math.min(minval, mini[i]);
    }
    int count = 0;for(
    int i = 0;i<mini.length;i++)
    {
        if (mini[i] == minval) {
            count = count + 1;
        }
    }

    System.out.println(count);

}}
