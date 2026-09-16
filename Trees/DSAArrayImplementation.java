import java.util.*;
public class DSAArrayImplementation {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] t = new int[n];
        for(int i = 0; i < n; i++) t[i] = s.nextInt();
        for(int i = 0; i < n; i++) System.out.println(t[i] + ": left=" + (2 * i + 1 < n ? t[2 * i + 1]: null) + ", right=" + (2 * i + 2 < n ? t[2 * i + 2]: null));
    }
}
