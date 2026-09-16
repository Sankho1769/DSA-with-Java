import java.util.*;
public class DSALinearSearch {
    static int search(int[] a, int x) {
        for(int i = 0; i < a.length; i++) if(a[i] == x) return i;
        return - 1;
    }
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        System.out.println(search(a, s.nextInt()));
    }
}
