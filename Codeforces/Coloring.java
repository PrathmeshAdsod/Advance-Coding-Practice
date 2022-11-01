import java.util.*;

public class Coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int pts[][] = new int[n][2];

        for (int l = 0; l < n; l++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            pts[l][0] = x;
            pts[l][1] = y;
        }

        int answer = n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    /*
                     * int val1 = Math.abs((pts[j][0] - pts[i][0]) + (pts[j][1] - pts[i][1]));
                     * int val2 = Math.abs((pts[k][0] - pts[i][0]) + (pts[k][1] - pts[i][1]));
                     * int val3 = Math.abs((pts[k][0] - pts[j][0]) + (pts[k][1] - pts[j][1]));
                     */
                    int val1 = Math.abs(pts[j][0] - pts[i][0]) + Math.abs((pts[j][1] - pts[i][1]));
                    int val2 = Math.abs((pts[k][0] - pts[i][0])) + Math.abs((pts[k][1] - pts[i][1]));
                    int val3 = Math.abs((pts[k][0] - pts[j][0])) + Math.abs((pts[k][1] - pts[j][1]));

                    if (val1 == val2 && val2 == val3)
                        answer++;

                    if (val1 < val2 && val1 < val3)
                        answer++;
                }
            }
        }
        System.out.println(answer);

    }
}
