import java.util.*;

public class SecondFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int z = 1; z <= t; z++) {
             
             String dime = sc.nextLine();
             String dimearr[] = dime.split(" ");
             int r = Integer.valueOf(dimearr[0]);
             int c = Integer.valueOf(dimearr[1]);

             char ch[][] = new char[r][c];

             for(int i = 0; i < r; i++) {
                String input = sc.nextLine();
                for(int j = 0; j < c; j++) {
                    ch[i][j] = input.charAt(j);
                }
             }

             int trees = 0;
             for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    if(ch[i][j] == '^') trees = trees + 1;
                }
             }
             if(trees == 0) {
                System.out.println("Case #"+z+": "+"Possible");
                for(int i = 0; i < r; i++) {
                    for(int j = 0; j < c; j++) {
                        System.out.print(ch[i][j]);
                    }
                    System.out.println();
                }
                 continue;
             } 

             for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    ch[i][j] = '^';
                }
             }
            boolean yes = true;
             for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                   yes = dfs(ch , i , j , r , c);
                   if(!yes) break;
                }
                if(!yes) break;
             }

             if(yes) {
                System.out.println("Case #"+z+": "+"Possible");
                for(int i = 0; i < r; i++) {
                    for(int j = 0; j < c; j++) {
                        System.out.print(ch[i][j]);
                    }
                    System.out.println();
                }
             }else {
                System.out.println("Case #"+z+": "+"Impossible");
             }


        }
    }
    public static boolean dfs(char ch[][] , int i,int j,int r,int c) {
         int count = 0;
         if(i - 1 >= 0) 
              if(ch[i-1][j] == '^') count++;
         if(j - 1 >= 0)
              if(ch[i][j-1] == '^') count++;
         if(i + 1 < r)
              if(ch[i+1][j] == '^') count++;
         if(j + 1 < c)
              if(ch[i][j+1] == '^') count++;

              return count > 1;
         
    }
}
