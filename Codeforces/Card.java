import java.util.*;

public class Card {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int z = 1; z <= T; z++) {

            int n = sc.nextInt();
            int alice[] = new int[n];
            for (int i = 0; i < n; i++) {
                alice[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int bob[] = new int[m];
            for (int i = 0; i < m; i++) {
                bob[i] = sc.nextInt();
            }

            int max1 = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                max1 = Math.max(max1, alice[i]);
            }

            int max2 = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                max2 = Math.max(max2, bob[i]);
            }

            if (max1 >= max2) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }

            if (max2 >= max1) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }

        }
    }
}
