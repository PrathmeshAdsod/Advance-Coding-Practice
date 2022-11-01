
import java.util.*;

public class Shoe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            int n = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
            int count = 0;
            int total = 0;
            for (int val : map.values()) {
                if (val != 1)
                    count += val - 1;
                total = total + val;
            }
            if (count % 2 != 0)
                count = count + 1;
            System.out.println(total - count);

        }

    }
}
