import java.util.*;

public class Paranoid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int n = sc.nextInt();
        sc.nextLine();

        String str = sc.nextLine();
        sc.close();
        int ans = n;

        int i = 0;
        int j = i;
        int k = j + 1;

        while (i < n - 2) {

            while (j < n - 1 && k < n) {
                String new_str = str.substring(j, k + 1);
                if (new_str.equals("01") || new_str.equals("10")) {
                    ans++;
                    j += 2;
                    k += 2;
                } else {
                    break;
                }
            }
            i++;
            j = i;
            k = j + 1;
        }
        if (str.substring(n - 1, n).equals("01") || str.substring(n - 1, n).equals("10")) {
            ans++;
        }

        System.out.println(ans);
    }
}
