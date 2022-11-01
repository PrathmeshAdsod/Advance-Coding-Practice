import java.util.*;

public class Crip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            StringBuilder sb = new StringBuilder();

            if (a > b) {
                int val = a / 2;
                while (val-- > 0) {
                    sb.append('0');
                }

                while (b-- > 0) {
                    sb.append('1');
                }
                int val2 = a - a / 2;
                while (val2-- > 0) {
                    sb.append('0');
                }
            } else {
                int val = b / 2;
                while (val-- > 0) {
                    sb.append('1');
                }

                while (a-- > 0) {
                    sb.append('0');
                }
                int val2 = b - b / 2;
                while (val2-- > 0) {
                    sb.append('1');
                }
            }

            System.out.println(sb.toString());

        }
    }
}
