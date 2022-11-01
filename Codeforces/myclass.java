
public class myclass {

    static boolean checkAlgo(String s, int n) {
        if (n == 1) {
            return true;
        }
        int count = 0;

        int start = 0;
        int end = n-1;

        while(start<=end) {
            if(s.charAt(start) == s.charAt(end)){
                count++;
                if(count > 1){
                    return false;
                }
            }else {
                count = 0;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "1010";
        int n = s.length();

        System.out.println(checkAlgo(s, n));
    }
}