import java.util.Scanner;

public class LetterBlocks {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int z = 1; z <= T; z++){

            int N = sc.nextInt();
            String arr[] = new String[N];
            for(int i = 1; i <= N; i++){
                arr[i] = sc.nextLine();
            }

            for(int i = 0; i < N; i++){
                boolean count[] = new boolean[26];
                for(int j = 0; j < arr[i].length(); j++){
                    char c = arr[i].charAt(j); 
                    if(!count[c-'a']) count[c-'a'] = true;
                    else {
                        System.out.println("IMPOSSIBLE");
                        return;
                    }
                }
            }

            


        }

    }
}
