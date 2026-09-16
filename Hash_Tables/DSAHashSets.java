import java.util.*;
public class DSAHashSets {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        Set < Integer > x = new HashSet < > ();
        int n = s.nextInt();
        for(int i = 0; i < n; i++) x.add(s.nextInt());
        int t = s.nextInt();
        System.out.println(x);
        System.out.println(x.contains(t));
    }
}
