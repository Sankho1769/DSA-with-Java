import java.util.*;
public class DSAKruskals {
    static class E {
        int u, v, w;
        E(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }
    static class D {
        int[] p, r;
        D(int n) {
            p = new int[n];
            r = new int[n];
            for(int i = 0; i < n; i++) p[i] = i;
        }
        int f(int x) {
            return p[x] == x ? x: (p[x] = f(p[x]));
        }
        boolean u(int a, int b) {
            a = f(a);
            b = f(b);
            if(a == b) return false;
            if(r[a] < r[b]) {
                int t = a;
                a = b;
                b = t;
            }
            p[b] = a;
            if(r[a] == r[b]) r[a]++;
            return true;
        }
    }
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        E[] e = new E[m];
        for(int i = 0; i < m; i++) e[i] = new E(s.nextInt(), s.nextInt(), s.nextInt());
        Arrays.sort(e, Comparator.comparingInt(x -> x.w));
        D d = new D(n);
        int total = 0, c = 0;
        for(E x: e) if(d.u(x.u, x.v)) {
            total += x.w;
            if(++ c == n - 1) break;
        }
        if(c != n - 1) throw new IllegalArgumentException("Disconnected");
        System.out.println(total);
    }
}
