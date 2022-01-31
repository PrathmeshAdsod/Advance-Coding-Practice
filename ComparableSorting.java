import java.util.Arrays;

public class ComparableSorting {

    static class Pair implements Comparable<Pair> {
        int a1;
        int a2;
        Pair(int a1,int a2) {
            this.a1 = a1;
            this.a2 = a2;
        } 
        
        public int compareTo(Pair other) //making it only compare a2 values
        {
            return this.a2 - other.a2; // becoz we want to compare a1 w.r.t a2;
        }

    }

    public static void main(String[] args) {
        int arr1[] = {7 ,2  ,2  ,3};
        int arr2[] = {8, 4,  7, 10};

        Pair pairs[] = new Pair[arr1.length]; //creating pairs array to store arr1 and arr2 relations

        for (int i = 0; i < pairs.length; i++)
        {
            pairs[i] = new Pair(arr1[i], arr2[i]); // adding arr1 and arr2 relations in pairs[i]
        }

        Arrays.sort(pairs);  // sort that pair , we are compairing w.r.t arr2

        for (int i = 0; i < arr1.length; i++)
        {
            System.out.print(pairs[i].a1 + " ");
        }


    }
}
