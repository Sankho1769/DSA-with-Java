import java.util.*;
public class DSALinkedLists {
    static class N {
        int v;
        N next;
        N(int v) {
            this.v = v;
        }
    }
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        N h = null, t = null;
        for(int i = 0; i < n; i++) {
            N q = new N(s.nextInt());
            if(h == null) h = t = q; else {
                t.next = q;
                t = q;
            }
        }
        for(N q = h; q != null; q = q.next) System.out.print(q.v + (q.next == null ? "\n": " -> "));
    }
}
