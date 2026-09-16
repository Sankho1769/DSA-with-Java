import java.util.*;
public class DSAAVLTree {
    static class N {
        int v, h = 1;
        N l, r;
        N(int v) {
            this.v = v;
        }
    }
    static int h(N n) {
        return n == null ? 0: n.h;
    }
    static void u(N n) {
        n.h = 1 + Math.max(h(n.l), h(n.r));
    }
    static N rr(N y) {
        N x = y.l, t = x.r;
        x.r = y;
        y.l = t;
        u(y);
        u(x);
        return x;
    }
    static N lr(N x) {
        N y = x.r, t = y.l;
        y.l = x;
        x.r = t;
        u(x);
        u(y);
        return y;
    }
    static N add(N n, int x) {
        if(n == null) return new N(x);
        if(x < n.v) n.l = add(n.l, x);
        else if(x > n.v) n.r = add(n.r, x);
        else return n;
        u(n);
        int b = h(n.l) - h(n.r);
        if(b > 1 && x < n.l.v) return rr(n);
        if(b < - 1 && x > n.r.v) return lr(n);
        if(b > 1) {
            n.l = lr(n.l);
            return rr(n);
        }
        if(b < - 1) {
            n.r = rr(n.r);
            return lr(n);
        }
        return n;
    }
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        N r = null;
        for(int i = 0; i < k; i++) r = add(r, s.nextInt());
        System.out.println("AVL height: " + h(r));
    }
}
