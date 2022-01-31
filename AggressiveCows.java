
// Question asking Maximize the Minimum distance

// This code is little bit different from Painters partition and Books allocation

import java.util.Arrays;

public class AggressiveCows {

    // isPossible method brobr smjun ghene
    static boolean isPossible(int stalls[],int n ,int k, int mid){
        int cows = 1;
        int min_dis = stalls[0];

        for(int i = 0;i < n;i++){

            // We want to maximize minimum distance stalls[i] - min_dis >= mid
            if(stalls[i] - min_dis >= mid){
                 cows++;
                 min_dis = stalls[i];
                 if(cows == k) return true;
            }
        }

        return false;

    }

    static int aggressiveCows(int stalls[] , int n , int k){
        
        Arrays.sort(stalls);

        int minimum = 0;
        int maximum = stalls[n-1] ;
        int result = -1;

       
        while(minimum <= maximum){
            int mid = (minimum+maximum)/2;
            
            if(isPossible(stalls,n,k,mid)) {
                  result = mid;
                  System.out.println(result);
                  // We want largest possible soln that's why going in right part if possible
                  minimum = mid + 1;
            }else {
                maximum = mid - 1;
            }
        }


        return result;
    }

   public static void main(String[] args) {
       int stalls[] = {1,2,8,4,9};
       int n = stalls.length;

       int k = 3;

       System.out.println(aggressiveCows(stalls, n, k));

   }
}