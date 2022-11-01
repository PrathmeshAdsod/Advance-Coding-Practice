import java.util.Scanner;

public class InfiniteAra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int z = 1; z <= T; z++){
              int R = sc.nextInt();
              int A = sc.nextInt();
              int B = sc.nextInt();

              double total = 0;
              double pi = 3.141592653589793238;

            
              double rada = 0, radb = 0;
              int rad = R;

              double radr = (pi*rad*rad);

              while(rad > 0){
                
                  rad = (rad*A);
                  if(rad <= 0) break;
                  rada += pi*(rad)*(rad);

                  rad = (rad/B);
                  if(rad <= 0) break;
                  radb += pi*(rad*rad);
              }

              total = rada+radb+radr;
              
              System.out.printf("Case #%d: %.6f",z,total);
              System.out.println();


        }

    }
}
