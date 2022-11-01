import java.util.Arrays;
import java.util.Comparator;

class Coordinates {
    int profit,weight;

    Coordinates(int profit,int weight){
        this.profit = profit;
        this.weight = weight;
    }
}

class Compair extends Coordinates{
    static void compare(Coordinates arr1[],int n){
        Arrays.sort(arr1,new Comparator<Coordinates>() {
            public int compare
        });
    }
}

public class ComparatorSort {
    
}
