import java.util.*;
public class DSAFordFulkerson {
    static int flow(int[][] c, int src, int sink) {
        int n = c.length, f = 0;
        int[][] r = new int[n][n];
        for(int i = 0; i < n; i++) r[i] = c[i].clone();
        while(true) {
            int[] par = new int[n];
            Arrays.fill(par, - 1);
            par[src] = src;
            Deque < Integer > q = new ArrayDeque < > ();
            q.push(src);
            while(! q.isEmpty() && par[sink] < 0) {
                int u = q.pop();
                for(int v = 0; v < n; v++) if(par[v] < 0 && r[u][v] > 0) {
                    par[v] = u;
                    q.push(v);
                    if(v == sink) break;
                }
            }
            if(par[sink] < 0) break;
            int path = Integer.MAX_VALUE;
            for(int v = sink; v != src; v = par[v]) path = Math.min(path, r[par[v]][v]);
            for(int v = sink; v != src; v = par[v]) {
                int u = par[v];
                r[u][v] -= path;
                r[v][u] += path;
            }
            f += path;
        }
        return f;
    }
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] c = new int[n][n];
        for(int i = 0; i < n; i++) for(int j = 0; j < n; j++) c[i][j] = s.nextInt();
        System.out.println(flow(c, s.nextInt(), s.nextInt()));
    }
}
