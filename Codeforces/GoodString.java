import java.io.*;
import java.util.*;


public class GoodString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            String[] line = br.readLine().split(" ");
            int N = Integer.parseInt(line[0]);
            int Q = Integer.parseInt(line[1]);
            String S = br.readLine();
            String[] arr_arr = br.readLine().split(" ");
            int[] arr = new int[N];
            for(int i_arr = 0; i_arr < arr_arr.length; i_arr++)
            {
            	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
            }
            int[][] ranges = new int[Q][2];
            for(int i_ranges = 0; i_ranges < Q; i_ranges++)
            {
            	String[] arr_ranges = br.readLine().split(" ");
            	for(int j_ranges = 0; j_ranges < arr_ranges.length; j_ranges++)
            	{
            		ranges[i_ranges][j_ranges] = Integer.parseInt(arr_ranges[j_ranges]);
            	}
            }

            int out_ = goodString(N, Q, S, arr, ranges);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
    static int goodString(int N, int Q, String S, int[] arr, int[][] ranges){
       // Write your code here
        int result = 0;
        StringBuilder sb = new StringBuilder();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
      Set<Integer> set;
      Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i < ranges.length; i++) {
            min = Math.min(min , ranges[i][0]);
            min = Math.min(min , ranges[i][1]);
            max = Math.max(max , ranges[i][0]);
            max = Math.max(max , ranges[i][1]);
        }
      
        sb.append(S.substring(min-1 , max));
       for(int i=0; i < sb.length(); i++) {
           char ch = sb.charAt(i);
           map.put(ch , map.getOrDefault(ch, 0) + 1);
       }
        //set = new HashSet<>();
        int req=0;
        for(int val : map.values()) {
            if(val > 1) req++;
        }
        if(req == 0) return 0;
        for(int i=0; i < arr.length; i++) {
            if(arr[i] < min-1 || arr[i] > max+1) {
               
                result++;
            }
            else {
               
                char ch = sb.charAt(arr[i]-1);
                
                if(map.get(ch) > 1){
                     map.put(ch , map.get(ch)-1);
                    
                }
                  result++;
            }
        }


        return result;
    
    }
}