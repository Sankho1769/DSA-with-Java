import java.util.*;
public class DSABubbleSort {
    static void sort(int[] a) {
        for(int e = a.length - 1; e > 0; e--) {
            boolean q = false;
            for(int i = 0; i < e; i++) if(a[i] > a[i + 1]) {
                int t = a[i];
                a[i] = a[i + 1];
                a[i + 1] = t;
                q = true;
            }
            if(! q) break;
        }
    }
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
