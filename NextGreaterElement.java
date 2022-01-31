import java.util.Stack;

public class NextGreaterElement {

    static int[] NGE(int arr[] , int n, int nge[]) {

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i = 1; i < n; i++){
            
            while( ! stack.isEmpty() && arr[i] > arr[stack.peek()]){
                  int a = stack.peek();
                  nge[a] =  arr[i];
                  stack.pop();
            }
            stack.push(i);

            
        }
        while( !stack.isEmpty()){
            int pos = stack.pop();
            nge[pos] = -1;
        }

        return nge;
    }

    public static void main(String[] args) {
        int arr[] = {13,7,6,12,10};
        int n = arr.length;
        int nge[] = new int[n];

        NGE(arr, n, nge);

        for(int i = 0; i < n; i++){
            System.out.print(nge[i] + " ");
        }


    }
}
