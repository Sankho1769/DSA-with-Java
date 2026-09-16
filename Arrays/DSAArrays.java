import java.util.*;
public class DSAArrays {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] x = new int[n];
        for(int i = 0; i < n; i++) x[i] = s.nextInt();
        System.out.println(Arrays.toString(x));
        System.out.println("Size: " + n);
    }
}
