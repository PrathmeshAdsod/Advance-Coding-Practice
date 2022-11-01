
import java.util.*;

public class Padlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

       for(int z = 1; z <= T; z++){
             
             int N = sc.nextInt();
             int D = sc.nextInt();

             int arr[] = new int[N];
             for(int i = 0; i < N; i++){
                 arr[i] = sc.nextInt();
             }
             List<Integer> range = new ArrayList<>();
             int count = 0;
             int i = 0;
             while(i < N){
                 if(arr[i] != 0){
                      range.add(arr[i]);
                 }else {
                     if(range.size() > 0){
                        count = count+1;
                        range.clear();
                     } 
                 }
                 i++;
             }
          

             System.out.println("Case #"+z+": "+count+1);

             
    
       }
   }
}
