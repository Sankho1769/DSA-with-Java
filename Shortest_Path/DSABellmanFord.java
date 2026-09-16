import java.util.*;
public class DSABellmanFord {
    static class E {
        int u, v, w;
        E(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }
    public static void main(String[] z) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt(), m = s.nextInt();
            E[] e = new E[m];
            for(int i = 0; i < m; i++) e[i] = new E(s.nextInt(), s.nextInt(), s.nextInt());
            int st = s.nextInt();
            long[] d = new long[n];
            Arrays.fill(d, Long.MAX_VALUE / 4);
            d[st] = 0;
            for(int i = 1; i < n; i++) {
                boolean ch = false;
                for(E x: e) if(d[x.u] < Long.MAX_VALUE / 8 && d[x.u] + x.w < d[x.v]) {
                    d[x.v] = d[x.u] + x.w;
                    ch = true;
                }
                if(! ch) break;
            }
            for(E x: e) if(d[x.u] < Long.MAX_VALUE / 8 && d[x.u] + x.w < d[x.v]) throw new IllegalArgumentException("Negative cycle");
            System.out.println(Arrays.toString(d));
        }
    }
}
