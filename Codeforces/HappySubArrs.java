import java.util.*;

public class HappySubArrs {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         for(int z = 1; z <= t; z++) {
            
             // TWO POINTERS
             int n = sc.nextInt();
             sc.nextLine();
             String str[] = sc.nextLine().split(" ");
             int arr[] = new int[n];
             for(int i = 0; i < n; i++)
                arr[i] = Integer.valueOf(str[i]);
            
             int i = 0 , j = 0;
             int ans = 0 , subarray = 0 ;
             int mod = 1000000007;
             boolean changed = false;
             while(i < n && j < n) {
                 subarray += arr[j];
                 if(subarray < 0) {
                     while( i <= j && ((arr[i] >= 0  && subarray - arr[i] <= 0) || (arr[i] < 0  && subarray + arr[i] <= 0))) {
                        if(arr[i] < 0) {
                            subarray += arr[i++];
                        }else {
                            subarray -= arr[i++];
                        }                        
                        changed = false;
                     }
                        j++;
                        changed = true;
                        if(subarray > 0) ans = (ans + subarray) % mod;
                   
                 }else {
                    changed = true;
                    ans = (ans + subarray) % mod;
                    j++;
                 }
             }
            /*  if(!changed){
                ans = (ans + subarray) % mod;
             }*/
             System.out.println(i);
             while( i < n ) {
                if(arr[i] < 0) {
                    subarray += arr[i++];
                }else {
                    subarray -= arr[i++];
                }     
                if(subarray >= 0) {
                    ans = (ans + subarray) % mod;
                }
                i++;
             }
             
             System.out.println("Case #"+z+": "+(ans % mod));
         }
    }
}
