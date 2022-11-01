import java.util.Scanner;

public class Pedestals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {

            int n = sc.nextInt();

            int sec = 0;
            int third = 0;

            int remainder = n % 2;
            int ans = n / 2;
            int first = ans;
            sec = first - 1;
            third = sec - 1;

            if (first + sec + third < n)
                first += remainder;

            if (first + sec + third > n) {
                third -= (first + sec + third) - n;
            }
            System.out.println(sec + " " + first + " " + third);

        }
    }
}
