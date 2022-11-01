public class RandomSumK {
        static int ans = 0;
        
        public static void main(String[] args) {
            int nums[] = {1 , 5 , 8 , 2 , 10};
            int k = 2;
            System.out.println(recurse(nums , k , 0 , 0));
        }
        public static int recurse(int nums[] , int k , int sum , int start){
            if(start >= nums.length || k < 0) return 0;
            if(k == 0) return sum;
            
            for(int i=start; i < nums.length; i++) {
                sum += nums[i];
                recurse(nums, k-1, sum, i+1);
                ans = Math.max(ans , sum);
                sum -= nums[i];
            }

            return ans;
        }
    
}
