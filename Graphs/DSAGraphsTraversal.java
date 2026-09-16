import java.util.*;
public class DSAGraphsTraversal {
    static List < Integer > bfs(List < List < Integer > > g, int st) {
        boolean[] v = new boolean[g.size()];
        Queue < Integer > q = new ArrayDeque < > ();
        List < Integer > o = new ArrayList < > ();
        q.add(st);
        v[st] = true;
        while(! q.isEmpty()) {
            int u = q.poll();
            o.add(u);
            for(int x: g.get(u)) if(! v[x]) {
                v[x] = true;
                q.add(x);
            }
        }
        return o;
    }
    static void dfs(List < List < Integer > > g, int u, boolean[] v, List < Integer > o) {
        v[u] = true;
        o.add(u);
        for(int x: g.get(u)) if(! v[x]) dfs(g, x, v, o);
    }
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        List < List < Integer > > g = new ArrayList < > ();
        for(int i = 0; i < n; i++) g.add(new ArrayList < > ());
        while(m-- > 0) {
            int u = s.nextInt(), v = s.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
        }
        int st = s.nextInt();
        List < Integer > o = new ArrayList < > ();
        dfs(g, st, new boolean[n], o);
        System.out.println("BFS: " + bfs(g, st));
        System.out.println("DFS: " + o);
    }
}
