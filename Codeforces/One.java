import java.util.Scanner;

public class One {

    static void print(String s){
         
          int zero = 0;
          int one = 0;
          int ans = 0;

          for(int i = 0; i < s.length(); i++){
              if(s.charAt(i) == '0'){
                  zero++;
              }else {
                  one++;
              }
          }

          if(one > zero){
              ans = zero;
          }else if(zero > one) {
              ans = one;
          }

         System.out.println(ans);
    }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i = sc.nextInt();
       String s = "";
       sc.next();

       for(int k = 1; k <= i; k++){
          s = sc.nextLine();
          print(s);
       }
       sc.close();
      

       
    }

   
}