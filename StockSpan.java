
// Understand stack solution first

public class StockSpan {

    public static void main(String[] args) {
        
    }
}


/*
Brute force approach : 

public class StockSpan {
    

    static int[] stocks(int price[],int days,int span[]){
        span[0] = 1;

        for(int i = days-1; i > 0 ; i--){
            int count = 1;
            for(int j = i - 1; j >= 0; j--){
                if(price[i] >= price[j]) {
                    count++;
                }
            }
            span[i] = count;
        }

        return span;
    }

    public static void main(String[] args) {
        int price[] = {100, 80, 60, 70, 60, 75, 85};
        int days = price.length;
        int span[] = new int[days];

        stocks(price, days,span);

        for(int i = 0; i < days; i++){
           System.out.print(span[i] + " ");
        }
        System.out.println();
    }
}
*/
