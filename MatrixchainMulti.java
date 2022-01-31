public class MatrixchainMulti {

    // Recursion
    static int matrixMul(int arr[],int start , int end){

        if(start == end){
            return 0;
        }

        int min = Integer.MAX_VALUE;

        // We can only partion end - 1 .. beoz lets take 
        // ABCD then we can partion it as A\B\C\D maximum 3 partion can be done on 4 length matrix
        for(int i = start; i < end; i++){
            int count = matrixMul(arr, start, i) 
                         + matrixMul(arr, i+1, end)
                         + arr[start-1]*arr[i]*arr[end];

            if(count < min) {
                min = count;
            }             
        }

        return min;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3 };
        int end = arr.length-1;
        int start = 1;


        System.out.println(matrixMul(arr,start,end));
 
    }
}
