import java.util.*;
public class DSAHashMaps {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        Map < String, String > m = new HashMap < > ();
        int n = s.nextInt();
        for(int i = 0; i < n; i++) m.put(s.next(), s.next());
        System.out.println(m.getOrDefault(s.next(), "Not found"));
    }
}
