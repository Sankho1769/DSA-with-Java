import java.util.*;
public class LinkedListsOperations {
    static class N {
        int v;
        N next;
        N(int v) {
            this.v = v;
        }
    }
    static class L {
        N h;
        void add(int x) {
            if(h == null) {
                h = new N(x);
                return;
            }
            N p = h;
            while(p.next != null) p = p.next;
            p.next = new N(x);
        }
        void del(int x) {
            if(h == null) return;
            if(h.v == x) {
                h = h.next;
                return;
            }
            N p = h;
            while(p.next != null && p.next.v != x) p = p.next;
            if(p.next != null) p.next = p.next.next;
        }
        boolean has(int x) {
            for(N p = h; p != null; p = p.next) if(p.v == x) return true;
            return false;
        }
    }
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        L l = new L();
        int n = s.nextInt();
        for(int i = 0; i < n; i++) l.add(s.nextInt());
        l.add(s.nextInt());
        l.del(s.nextInt());
        System.out.println(l.has(s.nextInt()));
    }
}
