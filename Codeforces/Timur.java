import java.util.Scanner;

public class Timur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {

            int timur = sc.nextInt();
            int ans = 0;
            for (int i = 1; i < 4; i++) {
                int other = sc.nextInt();
                if (other > timur)
                    ans = ans + 1;
            }
            System.out.println(ans);
        }
    }
}
