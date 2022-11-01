import java.util.*;

public class MinVariedNum {
    static int ans = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int z = 1; z <= t; z++) {
           int sum = sc.nextInt();
        
           int number = 0 , number2 = 0;
           int digit = 9;

           while(sum > 0) {
              if(sum - digit < 0) {
                    digit--;
                    continue;
              } 
              sum = sum - digit;
              number = number * 10 + digit;
              digit--;
           }
           while(number > 0) {
              number2 = (number2 * 10) + (number % 10);
              number /= 10;
           }
           
           System.out.println(number2);

        }
    }
}

