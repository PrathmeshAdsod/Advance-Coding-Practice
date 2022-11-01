
/* Segment Tree Construction and Query */

public class SegmentTree {

    public static void build(int arr[], int segment[], int ind, int low, int high) {

        // At low == high our segment tree will not proceed in depth beyond
        if (low == high) {
            segment[ind] = arr[low]; // as low == high
            return;
        }

        int mid = (low + high) / 2;

        build(arr, segment, 2 * ind + 1, low, mid);
        build(arr, segment, 2 * ind + 2, mid + 1, high);

        segment[ind] = Math.max(segment[2 * ind + 1], segment[2 * ind + 2]);

    }

    public static int query(int arr[], int seg[], int ind, int low, int high, int left, int right) {
        /* Node completely lies in Range we are seraching */
        if (low >= left && high <= right) {
            return seg[ind];
        }
        /* Node don't lie in Range we are seraching */
        if (high < left || low > right) {
            return Integer.MIN_VALUE;
        }

        /* Node Partially lies in Range we are seraching */
        int mid = (low + high) / 2;
        int l = query(arr, seg, 2 * ind + 1, low, mid, left, right);
        int r = query(arr, seg, 2 * ind + 2, mid + 1, high, left, right);

        return Math.max(l, r);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9, 11 };
        int n = arr.length;
        int segment[] = new int[4 * n];
        int index_of_root = 0;
        int low = 0;
        int high = n - 1;

        build(arr, segment, index_of_root, low, high);

        System.out.println("Builded Segment Tree is : ");
        for (int i = 0; i < segment.length; i++) {
            System.out.print(segment[i] + " ");
        }

        System.out.println();
        System.out.println(query(arr, segment, index_of_root, low, high, 0, 3));
    }
}
