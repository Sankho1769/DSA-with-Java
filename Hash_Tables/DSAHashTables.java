import java.util.*;
public class DSAHashTables {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        Map < String, Integer > m = new HashMap < > ();
        int n = s.nextInt();
        for(int i = 0; i < n; i++) m.merge(s.next(), 1, Integer :: sum);
        System.out.println(m);
    }
}
