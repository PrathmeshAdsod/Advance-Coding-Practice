import java.util.PriorityQueue;
import java.util.Scanner;

class Points {
    int x,y;
    Points(int x,int y) {
        this.x = x;
        this.y = y;
    }
}
public class Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int z=1; z<=T; z++) {
            
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i=0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            PriorityQueue<Points> pq = new PriorityQueue<>((a,b) -> b.x - a.x);
            int count = 0;

            for(int i=0; i < n; i++) {
                if(arr[i] < i+1) pq.offer(new Points(arr[i] , i+1));
            }

            for(int )


            System.out.println(count);
        }
    }
}
