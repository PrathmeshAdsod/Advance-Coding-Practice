public class ActivitySelection {


    static int[] activities(int k , int start[], int finish[],int act_completed[]){

       
        int count = 0;
        act_completed[count] = 0;
        int act_continue = finish[0];
        

        for(int i = 1; i < start.length; i++){

            if(count > k-1) break;  // becoz count start from 0 and k from 1

            if(start[i] < act_continue) {
                continue;
            }
            else {
                count++;
                act_continue = finish[i];
                act_completed[count] = i;
            }
        }

        return act_completed;
    }

    public static void main(String[] args) {

        int k = 4;
        int start[] = {1, 3, 0, 5, 8, 5};
        int finish[]= {2, 4, 6, 7, 9, 9}; // this is in sorted format

        int act_completed[] = new int[k];

        activities(k, start, finish,act_completed);
        for(int i = 0; i < act_completed.length; i++){

            System.out.print(act_completed[i] + " ");
            
        }
            System.out.println();
        /*

           k = 4;
           pos        0  1  2  3  4  5

         * start[] = {1, 3, 0, 5, 8, 5};
         * finish[]= {2, 4, 6, 7, 9, 9};
         * 
         * 
         * completed_activities = 0 1 3 4 
         * 
         * 
         * 
         */
    }
}
