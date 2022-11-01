import java.util.*;


public class Solution2 {

    public static int min(int a,int b,int c){
          if(a < b && a < c) return a;
          else if(b < a && b < c) return b;
          
          return c;
    }
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        for(int z = 1; z <= T; z++){


            int arr1[] = new int[4];
            int arr2[] = new int[4];
            int arr3[] = new int[4];

            for(int a = 0;  a < 4; a++){
                arr1[a] = sc.nextInt();
            }
            for(int a = 0;  a < 4; a++){
                arr2[a] = sc.nextInt();
            }
            for(int a = 0;  a < 4; a++){
                arr3[a] = sc.nextInt();
            }


            int result[] = new int[4];

            int total = 0;

            for(int i = 0;  i< 4; i++){
                if(total == 1000000) break;
                int minimum = min(arr1[i] , arr2[i] ,arr3[i]);
                result[i] = minimum;
                total += minimum;
            }

            if(total != 1000000) {
                System.out.println("Case #"+z+": IMPOSSIBLE");
                return;
            }
            System.out.println("Case #"+z+": "+result[0]+" "+result[1]+" "+result[2]+" "+result[3]);

        }
    }
}




/*import java.util.*;


public class Solution {
    public static void shuffle(int[] nums, int[] pos)
    {
        // create an auxiliary array of size `n`
        int[] aux = new int[nums.length];
 
        // fill the auxiliary array with the correct order of elements
        for (int i = 0; i < nums.length; i++) {
            aux[pos[i]] = nums[i];
        }
 
        // copy the auxiliary array back to the given array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = aux[i];
        }
    }
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        for(int z = 1; z <= T; z++){

            int N = sc.nextInt();

            int value[] = new int[N];
            int arr[] = new int[N];

            for(int i = 0; i < N; i++){
                value[i] = sc.nextInt();
            }

            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }
            
            Arrays.sort(arr);
            int i = 0;
            int j = arr.length - 1;
            while(i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }


            shuffle(arr , value);

            boolean visited[] = new boolean[arr.length];
//int a = 1; a <= arr.length; a++
            int max = 0;
            int total = 0;
            int a = 1;
            while(a <= arr.length){
                if(a == 0) total += max;
                  if(max < value[a] && !visited[a]){
                     max = value[a];
                  }
                  visited[a] = true;
                  a = arr[a];
            }
            
         
        }
    }
}

*/



/*
import java.util.*;


public class Solution {

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        for(int z = 1; z <= T; z++){

            int N = sc.nextInt();

            int arr[] = new int[N];

            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int total = 0;
            for(int i = 0; i < N; i++){
                if(arr[i] > total){
                    total++;
                }
            }

            System.out.println("Case #"+z+": "+total);
        }
    }
}


*/










/*import java.util.*;


public class Solution {

    public static void pattern1(int C){
        int i = 0 , j = 0;
        while(i <= C || j < C){
            if(i <= C) System.out.print("+");
            if(j < C) System.out.print("-");
            i++;
            j++;
        }
        System.out.println();
    }
    public static void pattern2(int C){
        int i = 0 , j = 0;
        while(i <= C || j < C){
            if(i <= C) System.out.print("|");
            if(j < C) System.out.print(".");
            i++;
            j++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        for(int z = 1; z <= T; z++){

            int R = sc.nextInt();
            int C = sc.nextInt();

            System.out.println("Case #"+z+":");

            // For 1st row
            System.out.print("..");
            int l = 0 , k = 0;
            while(l < C || k < C-1){
                if(l <= C) {
                    System.out.print("+");
                }
                if(k < C-1){
                    System.out.print("-");
                }
                l++;
                k++;
            }

            System.out.println();

            // For 2nd row
            System.out.print("..");
            l = 0;
            k = 0;
            while(l < C || k < C-1){
                if(l <= C) {
                    System.out.print("|");
                }
                if(k < C-1){
                    System.out.print(".");
                }
                l++;
                k++;
            }

            System.out.println();

            
            // Rest lines
            for(int i = 3; i <= (2*R+1); i++){
                 if(i%2 == 1){
                     pattern1(C);
                 }else {
                     pattern2(C);
                 }
            }



        }
    }
}

*/