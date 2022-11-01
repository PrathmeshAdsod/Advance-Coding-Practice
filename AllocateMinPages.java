
public class AllocateMinPages {

    static boolean isPossible(int arr[] , int n , int k , int current_minimum) {
        
        int req_students = 1; // Initially 1 student required
        int studet_curr_book_page = 0; // currently no books are alloted

        // Iterating over book
        for(int i = 0 ; i < n; i++) {
             if(arr[i] > current_minimum) return false;

             if(studet_curr_book_page + arr[i] <= current_minimum) {
                 studet_curr_book_page = studet_curr_book_page + arr[i];
             }
             else {
                 req_students++; 
                 // if req_student we have to incrase then his 
                 //starting book also have to update
                 studet_curr_book_page = arr[i]; 

                 if(req_students > k) return false;
             }
        }
        return true;

    }

    static int allocation(int arr[] , int n , int k) {

        if(n < k) return -1; // if books are less than students

        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        int minimum = 0, maximum = sum;
        int result = Integer.MAX_VALUE;

        while(minimum <= maximum) {
            int mid = (minimum+maximum)/2;

            if(isPossible(arr, n, k, mid)) {
                result = mid;
                maximum = mid - 1;
            }else {
                minimum = mid + 1;
            }
        }


        return result;
    }


    public static void main(String[] args) {
        int arr[] = {50, 74, 159, 181, 23, 45, 129, 174};
        int n = arr.length;
        int k = 6;

        System.out.println(allocation(arr, n, k));
    }
}