import java.util.*;

public class GBus {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      int abc = t;
      if(abc-- < t) {
        System.out.println();
      }
      for(int z= 1; z<=t; z++) {
            
            int n = sc.nextInt();

            int cities[][] = new int[n][2];
            sc.nextLine();
            String s = sc.nextLine();
            String str[] = s.split(" ");
            int k = 0,l=0;
            while(l < str.length) {
                 cities[k][0] = Integer.valueOf(str[l++]);
                 cities[k][1] = Integer.valueOf(str[l++]);
                 k++;
            }

            int P = sc.nextInt();
            int inst[] = new int[P];
            for(int i = 0; i < P; i++){
                inst[i] = sc.nextInt();
            }
            int ans[] = new int[P];

            for(int i = 0; i < P; i++) {
                int find = inst[i];
                int count = 0;
                for(int j = 0; j < n; j++) {
                    if(cities[j][0] <= find && cities[j][1] >= find) {
                        count = count + 1;
                    }
                }
                ans[i] = count;
            }

            StringBuilder result = new StringBuilder();
 
            for(int i = 0; i < P ; i++) {
                result.append(ans[i]+ " ");
            }

            System.out.println("Case #"+z+": "+result);
         
      }
   }    
}
