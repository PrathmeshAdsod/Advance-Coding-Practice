// Consequetive one's not allowed

/*

Given a positive integer N, count all
possible distinct binary strings of length
N such that there are no consecutive 1’s.

input : N = 1 
output : 2 i.e 0 , 1

input : N = 2 
output : 3 i.e 00 , 01 , 10 

input : N = 3
output : 5 i.e 000 , 001 , 010 , 100 ,101


By clearly obeserving it is fibnochi series

*/

public class DPproblem {

    static int cona(int n) {

        int c = 0;

        int a = 2; // for input 1
        int b = 3; // for input 2

        for(int i = 2; i < n; i++) {
            c = a+ b;
            a = b;
            b = c; 
        }

        return c;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(cona(n));
    }
}
