import java.util.*;
public class DSAStacks {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        Deque < Integer > st = new ArrayDeque < > ();
        int n = s.nextInt();
        for(int i = 0; i < n; i++) st.push(s.nextInt());
        System.out.println("Top: " + (st.isEmpty() ? "Empty": st.peek()));
        System.out.println("Pop: " + (st.isEmpty() ? "Empty": st.pop()));
    }
}
