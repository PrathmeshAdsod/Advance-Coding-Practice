import java.util.*;


public class Pancake {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int z = 1; z <= T; z++){
             
            int N = sc.nextInt();

            Deque<Integer> deque = new ArrayDeque<>();

            for(int i = 1; i <= N; i++){
                  deque.addLast(sc.nextInt());
                  
            }

            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            int count = 0;
            int i = 0;
            int j = deque.size()-1;
            while(i<=j){
                 
                 int first =  deque.getFirst();
                 int last  = deque.getLast();


                 if(pq.size() > 0){
                
                    if((first <= last && pq.peek() <= first) ){
                        count += 1;
                        pq.offer(first);
                        deque.remove(first);
                        i++;
                    }else if((last < first && pq.peek() < last)){
                        count += 1;
                        pq.offer(last);
                        deque.remove(last);
                        j--;
                    }else if((last < first && pq.peek()  < first)){
                        count += 1;
                        pq.offer(first);
                        deque.remove(first);
                        i++;
                    }else if((first < last && pq.peek()  < last)){
                        count += 1;
                        pq.offer(last);
                        deque.remove(last);
                        j--;
                    }
                    else {
                        break;
                    }

                 }
                 else {
                     if(first > last){
                         pq.offer(last);
                         deque.remove(last);
                         j--;
                     }else {
                         pq.offer(first);
                         deque.remove(first);
                         i++;
                     }
                     count += 1;
                 }

            }
            System.out.println("Case #"+z+": "+count);
        }
       

    }
}
