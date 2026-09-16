import java.util.*;
public class DSAQueues {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        Queue < Integer > q = new ArrayDeque < > ();
        int n = s.nextInt();
        for(int i = 0; i < n; i++) q.offer(s.nextInt());
        System.out.println("Front: " + (q.isEmpty() ? "Empty": q.peek()));
        System.out.println("Dequeue: " + (q.isEmpty() ? "Empty": q.poll()));
    }
}
