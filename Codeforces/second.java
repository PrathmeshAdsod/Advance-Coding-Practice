public class second {

    static int calculateOperation(int a, int b) {

        int count = 0;
        int first,sec,thir;

        while (a != b) {
            first = a + 1;
            sec = b + 1;
            thir = a | b;

            if (thir == b) {
                return count++;
            } else {

            }
            if (first == b) {
                return count++;
            } else if (sec == a) {
                return count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 3;

        System.out.println(calculateOperation(a, b));
    }
}
