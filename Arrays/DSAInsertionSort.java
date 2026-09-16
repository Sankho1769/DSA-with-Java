import java.util.*;
public class DSAInsertionSort {
    static void sort(int[] a) {
        for(int i = 1; i < a.length; i++) {
            int k = a[i], j = i - 1;
            while(j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = k;
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
