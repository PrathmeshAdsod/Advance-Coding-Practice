public class LCS2 {
    
    static int LCSRecursive(String str1 , String str2 , int M , int N) {

        // Creating strings in char Array
        char lcs[] = str1.toCharArray();
        char lcs2[] = str2.toCharArray();

        if(M == 0 || N == 0) {
            return 0;
        }

        if(lcs[M-1] == lcs2[N-1]) {
            return 1 + LCSRecursive(str1, str2, M-1, N-1);
        }
        else {
            // Recursive Leaf of Faith below line will give maximum of two strings
            return Math.max(LCSRecursive(str1, str2, M-1, N) , LCSRecursive(str1, str2, M, N-1));
        }

    }

    public static void main(String[] args) {
            String str1 = "Popatlal";
            String str2 = "Jethalal";

            int N = str1.length();
            int M = str2.length();

            System.out.println(LCSRecursive(str1, str2, M, N));


    }
}
