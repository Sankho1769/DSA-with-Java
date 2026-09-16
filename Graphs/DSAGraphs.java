import java.util.*;
public class DSAGraphs {
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
        System.out.println(g);
    }
}
