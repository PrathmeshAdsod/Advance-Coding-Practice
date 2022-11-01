import java.util.*;

public class PaliNum {
    static int printDivisors(long n,int count)
    {
        for (long i=1;i<=n/i;i++){
            if (n%i==0)
            {
                if(isPali(i)){
                    ++count;
                }
            
                if(isPali(n/i)){
                    ++count;
                }
            }
        }
           
        return count;      
    }

    static boolean isPali(long num){
        String str = String.valueOf(num);
        char ch[] = str.toCharArray();
        int i = 0;
        int j = ch.length-1;

        while(i <= j){
            if(ch[i] != ch[j]) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int T = sc.nextInt();

        for(int z = 1; z <= T; z++){
              long num = sc.nextLong();
            
              int count = printDivisors(num, 0);

              System.out.println("Case #"+z+": "+count);

              
     
        }
    }
}
