import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Heist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int f = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int frds[][] = new int[f][2]; 
        for(int i = 0; i < n; i++){
             list.add(sc.nextInt());
        }
        for(int i = 0; i < frds.length; i++){
            frds[i][0] = sc.nextInt();
            frds[i][1] = sc.nextInt();
        }

        boolean visited[] = new boolean[n+1];
        int minmoney[] = new int[n+1];
        minmoney[0] = Integer.MAX_VALUE;
        int result = 0;
        Arrays.fill(minmoney, Integer.MAX_VALUE);

        for(int i = 0; i < f; i++){
            int first = frds[i][0];
            int sec = frds[i][1];
            int mini = Integer.MAX_VALUE;

            if( ! visited[first] && !visited[sec]){
                mini = Math.min(list.get(first-1) , list.get(sec-1));
            }
            else if( !visited[first]){
               mini = Math.min(minmoney[sec] , list.get(first-1));
            }else {
                mini = Math.min(minmoney[first] , list.get(sec-1));
            }
            visited[first] = true;
            visited[sec] = true;
            minmoney[first] =  mini;
            minmoney[sec] = mini;
        }
    
        for(int i = 1; i < minmoney.length; i++){
             if(visited[i]) continue;
             else result += list.get(i-1);
             
        }


        System.out.println(result+2);

    }
}
