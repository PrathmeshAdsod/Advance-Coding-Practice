// This recursive cod eis giving stackoverflow exception

public class MinCostPath {

    static int min(int a , int b, int c) {
        if(a < b && a < c) {
            return a;
        }else if(b < a && b < c) {
            return b;
        }else if(c < a && c < b) {
            return c;
        }else {
            return a;
        }
    }

    static int minCost(int arr[][] , int n , int m) {
         if(n == 0 && m == 0) {
            return arr[n][m] ;
         }
         else {
             return min(
                 minCost(arr, n-1, m-1) , minCost(arr, n-1, m) , minCost(arr, n, m-1)
             ) + arr[n][m];
         }
    }

    public static void main(String[] args) {
        int arr[][] = {{1 , 2 , 3}, {4 , 8 , 2} , {1 , 5 , 3}};
        int n = arr.length;
        int m = arr.length;

        System.out.println(minCost(arr, n - 1, m - 1));
    }
} 
