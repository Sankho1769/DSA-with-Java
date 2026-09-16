import java.util.*;
public class DSAMergeSort {
    static void m(int[] a, int l, int r, int[] t) {
        if(l >= r) return;
        int mid = l + (r - l) / 2;
        m(a, l, mid, t);
        m(a, mid + 1, r, t);
        int i = l, j = mid + 1, k = l;
        while(i <= mid && j <= r) t[k++] = a[i] <= a[j] ? a[i++]: a[j++];
        while(i <= mid) t[k++] = a[i++];
        while(j <= r) t[k++] = a[j++];
        for(i = l; i <= r; i++) a[i] = t[i];
    }
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        m(a, 0, n - 1, new int[n]);
        System.out.println(Arrays.toString(a));
    }
}
