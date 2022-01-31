
// by this way desired answer dont come

public class MaximumTipCalculator
 {

    static int calculateTip(int N , int X , int Y , int A[] , int B[]){

        int max_tip = 0;

        for(int i = 0; i < N; i++){

            if(A[i] > B[i] && X != 0) {
                X--;
                max_tip = max_tip + A[i];
            }else if(B[i] > A[i] && Y != 0) {
                Y--;
                max_tip = max_tip + B[i];
            }else if(A[i] == B[i] && X != 0 ){
                X--;
                max_tip = max_tip + A[i];
            }
        }
        return max_tip;

    }

    public static void main(String[] args) {
        
        int N = 7 , X = 3, Y = 4;
        int A[] = {8, 7, 15, 19, 16, 16, 18};
        int B[] = {1, 7, 15, 11, 12, 31, 9};

        System.out.println("Maximum Tip is : " + calculateTip(N, X, Y, A, B));

    }

}
