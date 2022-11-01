import java.util.Arrays;
import java.util.Scanner;

public class essay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int z=1; z<=T; z++) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int q = sc.nextInt();

            sc.nextLine();

            String str = sc.nextLine();

            StringBuilder sb = new StringBuilder(str);

            int paste[][] = new int[c][2];
            int query[] = new int[q];

            for(int i=0; i < c; i++) {
                paste[i][0] = sc.nextInt();
                paste[i][1] = sc.nextInt();
            }
            for(int i=0; i < q; i++) {
                query[i] = sc.nextInt();
            }

            for(int i=0; i < c; i++) {
                String substr = sb.substring(paste[i][0] - 1, paste[i][1]);
                sb.append(substr);
            }

            for(int i=0; i < q; i++) {
                char res = sb.charAt(query[i]-1);
                System.out.println(res);
            }
            
            
        }

        sc.close();
    }
}
