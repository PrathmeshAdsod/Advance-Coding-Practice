
public class rotatedsortedsearch {

    static int searchSorted(int arr[] , int n , int key) {

        int low = 0;
        int high = n - 1;

        while(low <= high) {
            int mid = (low+high)/2;

            if(arr[mid] == key) return mid;

            if(arr[low] < arr[mid])  // Then left part is sorted
            {
                if(key >= arr[low] && key < arr[mid]) {
                    high = mid - 1;  // Go in left part
                }else {
                    low = mid + 1;  // Go in Right part
                }
            }else {                 // else right part sorted
                if(key > arr[mid] && key <= arr[high]) {
                    low = mid + 1;
                }else {
                    high = mid - 1;
                }
            }
        }

        return  -1;
    }

    public static void main(String[] args) {
         int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
         int n = arr.length;
         int key = 2;

         System.out.println(searchSorted(arr, n, key));

    }
}

