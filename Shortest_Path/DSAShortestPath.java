import java.util.*;
public class DSAShortestPath {
    public static void main(String[] a) {
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
        int[] d = new int[n];
        Arrays.fill(d, - 1);
        Queue < Integer > q = new ArrayDeque < > ();
        q.add(st);
        d[st] = 0;
        while(! q.isEmpty()) {
            int u = q.poll();
            for(int v: g.get(u)) if(d[v] < 0) {
                d[v] = d[u] + 1;
                q.add(v);
            }
        }
        System.out.println(Arrays.toString(d));
    }
}
