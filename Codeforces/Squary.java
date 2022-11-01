import java.util.Scanner;

public class Squary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int z = 1; z <= T; z++){

            int A = sc.nextInt();
            int B = sc.nextInt();
            
            int num1 = 1;
            int num2 = 1;
            while(num1 < 10e18) {
                int val1 = (A+B+num1)*(A+B+num1);
                int val2 = A*A + B*B + num1*num1;
                int val3 = (A+B+num1)*(A+B+num2);
                int val4 = A*A + B*B + num2*num2;

                if(val1 == val2){
                    System.out.println("Case #"+z+": "+num1);
                    return;
                }
                if(val3 == val4){
                    System.out.println("Case #"+z+": "+num2);
                    return;
                }
                num1++;
                num2--;
            }
            System.out.println("Case #"+z+": IMPOSSIBLE");
        }
       

    }
}
