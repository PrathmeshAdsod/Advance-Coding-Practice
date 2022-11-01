import java.util.*;

public class Banny {
    static int ans[] = new int[2];

    public static int[] dfs(int n , int r , int c,String instruction,int ind,boolean visited[][],int R,int C) {

        if(ind == n) {
            ans[0] = r;
            ans[1] = c;
            return ans;
        }
       
         if(visited[r][c]) {
            if(instruction.charAt(ind) == 'N') 
                r = r-1;
            
            if(instruction.charAt(ind) == 'S') 
               r = r + 1;
            
            if(instruction.charAt(ind) == 'E') 
               c = c + 1;
            
            if(instruction.charAt(ind) == 'W') 
                c = c - 1;
            visited[r][c] = true;
            dfs(n , r , c , instruction , ind , visited,R,C);
        }

        visited[r][c] = true;

        if(instruction.charAt(ind) == 'N') 
            r = r-1;
            
        if(instruction.charAt(ind) == 'S') 
            r = r + 1;
            
        if(instruction.charAt(ind) == 'E') 
            c = c + 1;
            
        if(instruction.charAt(ind) == 'W') 
            c = c - 1;
       
        dfs(n , r , c , instruction , ind+1 , visited,R,C);

        return ans;
    }


   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       sc.nextLine();
       for(int z=1; z <= t; z++) {
           
          String str = sc.nextLine();
          String strs[] = str.split(" ");
          int n =  Integer.valueOf(strs[0]);
          int R =  Integer.valueOf(strs[1]);
          int C =  Integer.valueOf(strs[2]);
          int r =  Integer.valueOf(strs[3]);
          int c =  Integer.valueOf(strs[4]);
          String instruction =  sc.nextLine();
          
          boolean visited[][]  =  new boolean[R][C];
          visited[r-1][c-1] = true;
          ans = dfs(n , r-1 , c-1 , instruction , 0 , visited , R , C);

          System.out.println("Case #"+t+": "+ans[0]+1 +" "+ans[1]+1);

       }
   }    


}
