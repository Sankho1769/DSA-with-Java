import java.util.*;
public class DSAPrims {
    static class E {
        int v, w;
        E(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        List < List < E > > g = new ArrayList < > ();
        for(int i = 0; i < n; i++) g.add(new ArrayList < > ());
        while(m-- > 0) {
            int u = s.nextInt(), v = s.nextInt(), w = s.nextInt();
            g.get(u).add(new E(v, w));
            g.get(v).add(new E(u, w));
        }
        boolean[] v = new boolean[n];
        PriorityQueue < int[] > q = new PriorityQueue < > (Comparator.comparingInt(x -> x[0]));
        q.add(new int[] {
            0, 0
        }
        );
        int total = 0, c = 0;
        while(! q.isEmpty()) {
            int[] p = q.poll();
            if(v[p[1]]) continue;
            v[p[1]] = true;
            total += p[0];
            c++;
            for(E e: g.get(p[1])) if(! v[e.v]) q.add(new int[] {
                e.w, e.v
            }
            );
        }
        if(c < n) throw new IllegalArgumentException("Disconnected");
        System.out.println(total);
    }
}
