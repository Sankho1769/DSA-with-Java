import java.util.*;
public class DSACountingSort {
    static int[] sort(int[] a) {
        if(a.length == 0) return a;
        int lo = a[0], hi = a[0];
        for(int x: a) {
            lo = Math.min(lo, x);
            hi = Math.max(hi, x);
        }
        if((long) hi - lo > 10000000) throw new IllegalArgumentException("Range too large");
        int[] c = new int[hi - lo + 1];
        for(int x: a) c[x - lo]++;
        int[] o = new int[a.length];
        int k = 0;
        for(int i = 0; i < c.length; i++) while(c[i]-- > 0) o[k++] = i + lo;
        return o;
    }
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        System.out.println(Arrays.toString(sort(a)));
    }
}
