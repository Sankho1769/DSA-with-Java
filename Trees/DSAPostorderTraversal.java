import java.util.*;
public class DSAPostorderTraversal {
    static class N {
        int v;
        N l, r;
        N(int v) {
            this.v = v;
        }
    }
    static N ins(N n, int x) {
        if(n == null) return new N(x);
        if(x < n.v) n.l = ins(n.l, x);
        else n.r = ins(n.r, x);
        return n;
    }
    static void postorder(N n, List < Integer > out) {
        if(n == null) return;
        postorder(n.l, out);
        postorder(n.r, out);
        out.add(n.v);
    }
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        N r = null;
        for(int i = 0; i < k; i++) r = ins(r, s.nextInt());
        List < Integer > o = new ArrayList < > ();
        postorder(r, o);
        System.out.println(o);
    }
}
