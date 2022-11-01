import java.util.*;

public class Directional {
    public static boolean check(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = n;
        int arr1[] = new int[k];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        sc.close();
        int arr2[] = new int[k];

        int ptr = 0;
        boolean ans = false;
        if (n == 1) {
            System.out.println("Yes");
            return;
        }

        while (true) {
            if (ptr == 0) {
                if (arr2[ptr] >= arr1[ptr]) {
                    ans = check(arr1, arr2);
                    break;
                } else {
                    arr2[ptr]++;
                }

                ptr++;
            } else if (ptr == n - 1) {
                if (arr2[ptr] > arr1[ptr]) {
                    arr2[ptr]--;
                } else if (arr2[ptr] > arr1[ptr]) {
                    ans = check(arr1, arr2);
                }
                ptr--;
            } else {
                if (arr1[ptr - 1] == arr2[ptr - 1] && arr1[ptr + 1] == arr2[ptr + 1]) {
                    ans = false;
                    break;
                } else if (arr1[ptr] < arr2[ptr]) {
                    arr2[ptr]++;
                    ptr++;
                } else {
                    arr1[ptr]--;
                    ptr--;
                }
            }
        }
        String str = (ans) ? "Yes" : "No";
        System.out.println(str);

    }
}
