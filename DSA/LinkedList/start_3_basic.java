package LinkedList;

public class start_3_basic {
    public static void print(Node head) {
        if(head == null) return;
        System.out.println(head.val);
        print(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(13);
        Node c = new Node(14);
        Node d = new Node(15);
        Node e = new Node(16);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        print(a);
    }
}
