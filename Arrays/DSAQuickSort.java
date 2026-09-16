import java.util.*;
public class DSAQuickSort {
    static void q(int[] a, int l, int r) {
        if(l >= r) return;
        int p = a[r], i = l;
        for(int j = l; j < r; j++) if(a[j] <= p) {
            int t = a[i];
            a[i++] = a[j];
            a[j] = t;
        }
        int t = a[i];
        a[i] = a[r];
        a[r] = t;
        q(a, l, i - 1);
        q(a, i + 1, r);
    }
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        q(a, 0, n - 1);
        System.out.println(Arrays.toString(a));
    }
}
