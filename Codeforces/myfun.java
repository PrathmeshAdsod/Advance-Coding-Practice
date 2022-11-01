import java.util.*;

public class myfun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int z=1; z<=T; z++) {
            int n = sc.nextInt();
            sc.nextLine();
            Set<String> set = new HashSet<>();
            List<String> list = new ArrayList<>();

            for(int i=0; i < n; i++) {
                String str = sc.nextLine();
                set.add(str);
                list.add(str);
            }

            StringBuilder sb = new StringBuilder();

            for(String val : list) {
                String str = val;
                boolean flag = false;
                for(int i=0; i < str.length(); i++) {
                    String s1 = str.substring(0 , i);
                    String s2 = str.substring(i , str.length());
                    if(set.contains(s1) && set.contains(s2)) {
                        flag = true;
                        break;
                    }
                }
                if(flag) {
                    sb.append('1');
                }else {
                    sb.append('0');
                }
            }

            System.out.println(sb.toString());


        }
    }
}
