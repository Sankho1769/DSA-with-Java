import java.util.*;
public class DSARadixSort {
    static void pos(int[] a) {
        for(long e = 1; ; e *= 10) {
            int[] c = new int[10], o = new int[a.length];
            boolean any = false;
            for(int x: a) {
                int d = (int)((x / e) % 10);
                if(x / e > 0 || e == 1) any = true;
                c[d]++;
            }
            if(! any) break;
            for(int i = 1; i < 10; i++) c[i] += c[i - 1];
            for(int i = a.length - 1; i >= 0; i--) {
                int d = (int)((a[i] / e) % 10);
                o[-- c[d]] = a[i];
            }
            System.arraycopy(o, 0, a, 0, a.length);
            if(e > Integer.MAX_VALUE / 10) break;
        }
    }
    static int[] sort(int[] a) {
        int[] n = Arrays.stream(a).filter(x -> x < 0).map(x -> - x).toArray(), p = Arrays.stream(a).filter(x -> x >= 0).toArray();
        pos(n);
        pos(p);
        int[] o = new int[a.length];
        int k = 0;
        for(int i = n.length - 1; i >= 0; i--) o[k++] = - n[i];
        for(int x: p) o[k++] = x;
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
