import java.util.Scanner;

public class div1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        for(int i = 1; i <= in; i++){
            int n = sc.nextInt();

            if(n % 7 == 0){
                System.out.println(n);
            }else {
                for(int j = 1;j < 7; j++){
                    int k = n+j;
                    int m = n-j;
                    if(k % 7 == 0 && k < 1000) {
                      System.out.println(k);
                      break;
                    }
                    else if(m % 7 == 0 && m > 9){
                        System.out.println(m);
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}