public class DSALinkedListsInMemory {
    static class Node {
        int value;
        Node next;
        Node(int v) {
            value = v;
        }
    }
    public static void main(String[] a) {
        Node x = new Node(10);
        x.next = new Node(20);
        System.out.println("Node 10 -> Node 20 -> null");
    }
}
