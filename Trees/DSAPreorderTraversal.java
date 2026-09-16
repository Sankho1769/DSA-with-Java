import java.util.*;
public class DSAPreorderTraversal {
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
    static void preorder(N n, List < Integer > out) {
        if(n == null) return;
        out.add(n.v);
        preorder(n.l, out);
        preorder(n.r, out);
    }
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        N r = null;
        for(int i = 0; i < k; i++) r = ins(r, s.nextInt());
        List < Integer > o = new ArrayList < > ();
        preorder(r, o);
        System.out.println(o);
    }
}
