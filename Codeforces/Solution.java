import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        long prefix[] = new long[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long pre = arr[0];
        prefix[0] = pre;

        for(int i=1; i < n; i++) {
            if(pre <= arr[i]) {
                prefix[i] = pre;
            }
            else {
                pre = arr[i];
                prefix[i] = pre;
            }
        }
        long sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + prefix[i];
        }
         
        System.out.println(sum);

    }
}
