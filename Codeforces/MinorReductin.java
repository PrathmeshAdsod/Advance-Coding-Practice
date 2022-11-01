import java.util.Scanner;

public class MinorReductin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int num = sc.nextInt();
            String num_str = Integer.toString(num);
            String num_formed = num_str;

            for(int j = 0; j < num_str.length()-1; j++){
                 int add = num_str.charAt(j) + num_str.charAt(j+1);
                 if(num_formed < actual){
                     num_formed = actual;
                 }
            }
        }

    }
}
