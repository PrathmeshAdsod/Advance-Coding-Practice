import java.util.*;

public class NiceString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int ans = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j <= n; j++) {
                String s = str.substring(i , j);
               // System.out.println(s);
                for(int k = 0;k < s.length(); k++) {
                    if(s.charAt(k) == '1') {
                        ans++;
                        break;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}

