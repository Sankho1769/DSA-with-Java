import java.util.*;
public class DSADijkstra {
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
            if(w < 0) throw new IllegalArgumentException("Negative weight");
            g.get(u).add(new E(v, w));
        }
        int st = s.nextInt();
        int[] d = new int[n];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[st] = 0;
        PriorityQueue < int[] > q = new PriorityQueue < > (Comparator.comparingInt(x -> x[0]));
        q.add(new int[] {
            0, st
        }
        );
        while(! q.isEmpty()) {
            int[] p = q.poll();
            if(p[0] != d[p[1]]) continue;
            for(E e: g.get(p[1])) if(d[e.v] > p[0] + e.w) {
                d[e.v] = p[0] + e.w;
                q.add(new int[] {
                    d[e.v], e.v
                }
                );
            }
        }
        System.out.println(Arrays.toString(d));
    }
}
