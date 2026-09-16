import java.util.*;
public class DSASelectionSort {
    static void sort(int[] a) {
        for(int i = 0; i < a.length; i++) {
            int m = i;
            for(int j = i + 1; j < a.length; j++) if(a[j] < a[m]) m = j;
            int t = a[i];
            a[i] = a[m];
            a[m] = t;
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
