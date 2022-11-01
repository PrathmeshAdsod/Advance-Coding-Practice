import java.util.*;

public class ICPCBallons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int z=1; z<=T; z++) {
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();

            int count = 0;
            Set<Character> set = new HashSet<>();

            for(int i=0; i < n ; i++) {
                char ch = str.charAt(i);
                if(!set.contains(ch)) {
                    count += 2;
                    set.add(ch);
                }
                else count += 1;
            }
            System.out.println(count);
        }
    }
}
