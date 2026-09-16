import java.util.*;
public class DSABinarySearchTrees {
    static class N {
        int v;
        N l, r;
        N(int v) {
            this.v = v;
        }
    }
    static N add(N n, int x) {
        if(n == null) return new N(x);
        if(x < n.v) n.l = add(n.l, x);
        else if(x > n.v) n.r = add(n.r, x);
        return n;
    }
    static boolean find(N n, int x) {
        while(n != null) {
            if(n.v == x) return true;
            n = x < n.v ? n.l: n.r;
        }
        return false;
    }
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        N r = null;
        for(int i = 0; i < k; i++) r = add(r, s.nextInt());
        System.out.println(find(r, s.nextInt()));
    }
}
