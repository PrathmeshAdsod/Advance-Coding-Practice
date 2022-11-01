import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DurationTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        int n = sc.nextInt();
        int answer[] = new int[n];
        for (int i = 0; i < n; i++) {
            queue.offer(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            queue2.offer(sc.nextInt());
        }
        int q2 = queue2.remove();
        answer[0] = Math.abs(queue.remove() - q2);
        int q3 = 0;
        for (int i = 1; i < n - 1; i++) {
            if (q2 < queue.remove()) {
                q2 = queue2.remove();
                answer[i] = Math.abs(queue.remove() - q2);
            } else {
                q3 = queue2.remove();
                answer[i] = Math.abs(q3 - q2);
                q2 = q3;

                queue.remove();
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(answer[i]);
        }

    }
}
