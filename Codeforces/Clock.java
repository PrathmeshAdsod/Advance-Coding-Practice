import java.util.*;

public class Clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int z = 1; z <= t; z++) {
            int n = sc.nextInt();
            int H = sc.nextInt()+1;
            int T = sc.nextInt()+1;
            int alarms[][] = new int[n][2];

            for(int i = 0; i < n; i++) {
                alarms[i][0] = sc.nextInt() + 1;
                alarms[i][1] = sc.nextInt() + 1;
            }

            Arrays.sort(alarms , (a,b) -> (a[0] != b[0]) ? a[0] - b[0] : a[1] - b[1]);

            int H1 = alarms[0][0];
            int M1 = alarms[0][1];

            if(H1 == H && T1 == T) {
                System.out.println("No");
                return;
            }

            

        }
    }


}
