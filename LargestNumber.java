public class LargestNumber {

    static String findNum(int sum, int num) {
        String req_num = "";

        if (sum > num * 9) {
            return "-1";
        }

        for (int i = 0; i < num; i++) {

            if (sum >= 9) {
                req_num += '9';
                sum = sum - 9;
            } else if (sum < 9 && sum > 0) {
                req_num += sum;
                sum = 0;
            } else if (sum == 0) {
                req_num += '0';
            }

        }

        return req_num;
    }

    public static void main(String[] args) {

        int N = 6, Sum = 36;

        System.out.println(findNum(Sum, N));
        /*
         * N = 5, S = 12
         * Output:
         * 93000
         * 
         * 
         * 93000
         * 
         * Sum = 12
         * 
         * Sum = Sum - 9 = 3
         * 93
         * Sum = Sum - 3 = 0;
         * if(Sum == 0 && num.length < N) {
         * concat with the number formed until num.length == N
         * }
         */
    }
}
