public class PaintersPartition {
    
    static boolean isPossible(int nums[] , int n, int k , int mid) {

        int painters = 1;
        int painting = 0;

        // Iterate through all walls
        for(int i = 0; i < n; i++){

            if(nums[i] > mid) return false;

            if(nums[i] + painting > mid){
                // if this condition is true then we need one extra painter
                painters++;
                // that painter will start painting from this index array
                painting = nums[i];

                if(painters > k) return false;
            }
            else {
                painting += nums[i];
            }
        }

        return true;
    }

    static int paintersPartition(int nums[] , int n, int k) {

        if(k > n) return -1;

        int minimum = 0;
        int maximum = 0;
        int result = -1;
        for(int i = 0; i < n; i++){
            maximum += nums[i];
        }

        while(minimum <= maximum) {
            int mid = (minimum+maximum)/2;

            if(isPossible(nums, n, k , mid)){

                result = mid;
                maximum = mid - 1;

            }else {
                minimum = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {10, 20, 60, 50, 30, 40};
        int n = nums.length;
        int k = 3;

        System.out.println(paintersPartition(nums, n, k));
    }
}
