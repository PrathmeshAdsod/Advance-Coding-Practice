public class N_Meetings {

    static int count_meets(int start[],int finish[],int n){

        int count = 1;  // Person is doing his first meeting
        int last_meet = finish[0];

        for(int i = 1; i < n; i++){

            if(start[i] >= last_meet) {
                count++;
                last_meet = finish[i];
            }
            else {
                continue;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int start[]  = {1, 3, 0, 5, 8, 5};
        int finish[] = {2, 4, 6, 7, 9, 9} ;// This array is sorted
        // If second array was not sorted then we have to sort both array using 
        // comparator interface w.r.t finish[]

        int n = start.length;

        System.out.println(count_meets(start, finish, n));


    }
}
