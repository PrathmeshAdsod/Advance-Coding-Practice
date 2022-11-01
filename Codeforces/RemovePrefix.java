import java.util.*;
public class RemovePrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int z = 1; z <= t; z++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            Map<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            int ans = 0 , until = 0;
            for(int i =0;i < n; i++) {
                if(map.get(arr[i]) != 1) {
                    map.put(arr[i] , map.get(arr[i]) - 1 );
                    ans = Math.max(until , ans);
                }
                until += 1;
            }
            System.out.println(ans);
        }
    }
}
