import java.util.*;

public class GKSF1 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int T = sc.nextInt();

         for(int z = 1; z <= T; z++) {
            int n = sc.nextInt();
            String arr1[][] = new String[n][3];
            String arr2[][] = new String[n][3];
            
            sc.nextLine();
            
            for(int i = 0; i < n; i++){
                String str[] = sc.nextLine().split(" ");
                String color = str[0];
                String durability = str[1];
                String ID = str[2];

                arr1[i][0] = color;
                arr1[i][1] = durability;
                arr1[i][2] = ID;

                arr2[i][0] = color;
                arr2[i][1] = durability;
                arr2[i][2] = ID;
            }

            Arrays.sort(arr2 , (a , b) -> ( Integer.valueOf(a[1]) == Integer.valueOf(b[1])) ?  Integer.valueOf(a[2]) - Integer.valueOf(b[2]) :  Integer.valueOf(a[1]) - Integer.valueOf(b[1]) );

            
          


         }

     }    
}
