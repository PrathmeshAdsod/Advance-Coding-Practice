import java.util.Stack;

// We will use elimination thechnique here
// Use stack for it
// Problem is easy .. Go theough sumit malik pepcoding utube channel for this problem

public class Celibrity {

    static int isCelibrity(int party[][], int n) {

        Stack<Integer> stack = new Stack<>();

        int row = -1 , col = -1 , maybe_celibrity = -1;

        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        while (! stack.isEmpty()) {

            if(stack.size() == 1){
                maybe_celibrity = stack.pop();
                break;
            } 

            row = stack.pop();
            col = stack.pop();

            if (party[row][col] == 1) {
                stack.push(col);
            } else {
                stack.push(row);
            }
        }

       for(int i = 0; i < n; i++){
           if(party[maybe_celibrity][maybe_celibrity] == 0){
               continue;
           }
           if(party[maybe_celibrity][i] == 1 && party[i][maybe_celibrity] == 0){
               return  -1;
           }
       }
       
       return maybe_celibrity;


    }

    public static void main(String[] args) {
        /*int party[][] = {
                { 0, 1, 1, 1 },
                { 1, 0, 1, 0 },
                { 0, 0, 0, 0 },
                { 1, 1, 1, 0 }
        };*/
        int party[][] = {{0, 0 ,0},
        {0, 0 ,0}, 
        {0 ,0 ,0}};

        int n = party.length;

        System.out.println(isCelibrity(party, n));

    }
}
