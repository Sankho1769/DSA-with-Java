import java.util.*;
public class DSASimpleAlgorithm {
    static int max(int[] a) {
        if(a.length == 0) throw new IllegalArgumentException();
        int m = a[0];
        for(int x: a) m = Math.max(m, x);
        return m;
    }
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        System.out.println(max(a));
    }
}
