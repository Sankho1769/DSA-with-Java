import java.util.*;
public class GraphsImplementation {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        int[][] x = new int[n][n];
        while(m-- > 0) {
            int u = s.nextInt(), v = s.nextInt();
            x[u][v] = x[v][u] = 1;
        }
        for(int[] r: x) System.out.println(Arrays.toString(r));
    }
}
