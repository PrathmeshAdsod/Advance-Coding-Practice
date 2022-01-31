
import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value , weight;
    Item(int x , int y){
        this.value = x;
        this.weight = y;
    }
}

class itemComparator implements Comparator<Item>{

    public int compare(Item a,Item b) {

         double r1 = (double) (a.value) / (double) (a.weight);

         double r2 = (double) (b.value) / (double) (b.weight);

         if(r1 < r2){
             return 1;
         }
         else if(r1 > r2) {
             return -1;
         }
         else {
             return 0;
         }
    }

}

public class FractionalKnapsack {


    static double knapsack(int W , Item arr[] , int n){

        Arrays.sort(arr , new itemComparator());

        int currWeight = 0;
        double finalValue = 0;

        for(int i = 0; i < n; i++){

            if(currWeight + arr[i].weight <= W){
                currWeight = currWeight + arr[i].weight;
                finalValue = finalValue + arr[i].value;
            }

            else {
                int remain = W - currWeight;
                finalValue = finalValue + 
                ( (double) arr[i].value / (double) arr[i].weight  ) * (double) remain ;

                break;
            }

        }
        return finalValue;
    }


    public static void main(String[] args) {
        int[] Weight = { 10, 40, 20, 30 };
        int[] value = { 60, 40, 100, 120 };
        int n = value.length;
        int W = 50;

        System.out.println(knapsack(W, , n));
    }
}
