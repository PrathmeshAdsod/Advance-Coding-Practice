import java.util.Scanner;

public class Yes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
         sc.nextLine();
        for(int z=1; z<=T; z++) {
            String str = sc.nextLine();

        str = str.toUpperCase();

        if(str.equals("YES")) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        }
    }
}