import java.util.Scanner;

public class Cypher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

       
           for(int z=1; z<=T; z++) {
            int n = sc.nextInt();
            int nums[] = new int[n];
            String strs[] = new String[n];
            for(int i=0; i < n; i++) {
                int val =  sc.nextInt();
                nums[i] = val;
            }
            sc.nextLine();
            for(int i=0; i < n; i++) {
             String str =  sc.nextLine();
             strs[i] = str;
           
          }

          for(int i=0; i < n; i++) {
              int numval= nums[i];
              String str = strs[i].substring(2);

              for(int j=0; j < str.length(); j++) {
                  char ch = str.charAt(j);
                  if(ch == 'D' && numval == 9) {
                      numval = 0;
                  }else if(ch == 'D') {
                      numval++;
                  }else if(ch == 'U' && numval == 0) {
                      numval = 9;
                  }else if(ch == 'U'){
                      numval--;
                  }
              }
              nums[i] = numval;
          }
          
          for(int i=0; i < n; i++) {
              System.out.print(nums[i] + " ");
          }
          System.out.println();
           }
      
        
    }
}
