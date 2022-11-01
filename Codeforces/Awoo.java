import java.util.*;

public class Awoo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int z = 1; z <= T; z++) {

            int n = sc.nextInt();
            sc.nextLine();
            String s1 = sc.nextLine();

            String s2 = sc.nextLine();

            Map<Character, Integer> map = new HashMap<>();
            // Map<String, Integer> map2 = new HashMap<>();

            for (int i = 0; i < n; i++) {
                if (map.containsKey(s1.charAt(i))) {
                    map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
                } else {
                    map.put(s1.charAt(i), 1);
                }
            }

            for (int i = 0; i < n; i++) {

                if (map.containsKey(s2.charAt(i))) {
                    map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
                }

            }
            boolean no = false;
            for (int i = 0; i < n; i++) {

                if (map.get(s1.charAt(i)) != 0) {
                    no = true;
                    break;
                }

            }
            String ans = (no) ? "NO" : "YES";
            System.out.println(ans);

        }

    }

}
