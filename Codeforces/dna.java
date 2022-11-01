import java.util.Scanner;

public class dna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
       

        char A = 'A';
        char T = 'T';
        char C = 'C';
        char G = 'G';

        int k = 0;
        int k_with_bond=0 ;
        int bonds = 0;
        int max_bond = Integer.MIN_VALUE;
        String new_str = "";
        for (int i = 0; i < n; i++) {
            bonds = 0;
            new_str = s.charAt(i) + new_str;
            s = s.substring(i+1);

            for (int j = 0, l = 0;j < s.length() && l < new_str.length(); j++, l++) {
                if ((s.charAt(j) == A && new_str.charAt(l) == T) || (s.charAt(j) == T && new_str.charAt(l)== A)) {
                    bonds++;
                }
                if ((s.charAt(j) == C && new_str.charAt(l) == G) || (s.charAt(j) == G && new_str.charAt(l) == C)) {
                    bonds++;
                }
             
            }
            k = k+1;
            if (bonds > max_bond) {
                max_bond = bonds;
                k_with_bond = k;
            }

        }
        System.out.print(k_with_bond+1 +" ");
        System.out.print(max_bond);

    }
}
