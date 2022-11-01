import java.util.* ;

public class ColoredBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int z = 1; z <= t; z++) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            String str[] = s.split(" ");

            int max = 0 , ans = 1;

            for(int i = 0; i < n; i++) {
                if(max < Integer.valueOf(str[i])) {
                     ans = i+1;
                     max =  Integer.valueOf(str[i]);
                }
            }

            System.out.println(ans);
        }
    }
}
