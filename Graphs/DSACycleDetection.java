import java.util.*;
public class DSACycleDetection {
    static boolean cyc(List < List < Integer > > g) {
        boolean[] v = new boolean[g.size()];
        for(int st = 0; st < g.size(); st++) if(! v[st]) {
            Queue < int[] > q = new ArrayDeque < > ();
            q.add(new int[] {
                st, - 1
            }
            );
            v[st] = true;
            while(! q.isEmpty()) {
                int[] p = q.poll();
                for(int x: g.get(p[0])) {
                    if(! v[x]) {
                        v[x] = true;
                        q.add(new int[] {
                            x, p[0]
                        }
                        );
                    } else if(x != p[1]) return true;
                }
            }
        }
        return false;
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
        System.out.println(cyc(g));
    }
}
