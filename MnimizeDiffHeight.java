import java.util.Arrays;

public class MnimizeDiffHeight {

    static int minimizeMaximum(int k,int arr[],int n){
        Arrays.sort(arr);
        
        int ans = arr[n-1] - arr[0];
        
        int first = arr[0] + k;
        int last = arr[n-1] - k;
        
        int mini,maxi;
        
        for(int i = 0; i < n-1; i++){
            // Below two lines will store
            // val of next index - val of current index
            mini = Math.min(first,arr[i+1]-k);
            maxi = Math.max(last,arr[i]+k);
            
            if(mini < 0) continue;
            // ans will store minimum difference
            ans = Math.min(ans , maxi-mini);
        }
        return ans;
    }

    public static void main(String[] args) {
        int k = 3, n = 5;
        int arr[] = {3, 9, 12, 16, 20};

        System.out.println(minimizeMaximum(k,arr,n));

    }
}