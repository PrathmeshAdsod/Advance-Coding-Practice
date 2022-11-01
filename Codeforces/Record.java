import java.util.*;

class Record {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int z=1; z<=t; z++) {
            int n = sc.nextInt();
            if(n == 0 || n == 1) {
                System.out.println(n);
                return ;
            }
            int nums[] = new int[n];
            int count = 0;
            for(int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int arr[] = new int[n];
            arr[0] = nums[0];
            for(int i = 1; i < n; i++) {
                arr[i] = Math.max(nums[i] , arr[i-1]);
            }
            
            if(nums[0] > nums[1]) {
                ++count;
            }
            if(nums[n-1] > arr[n-2]) {
                ++count;
            }

            for(int i = 1; i < n-1; i++) {
                if(nums[i] > arr[i-1] && nums[i] > nums[i+1] ) {
                    ++count;
                }
            }
            
            System.out.println("Case #"+z+": "+count);
        }
        
        
    }
    
}