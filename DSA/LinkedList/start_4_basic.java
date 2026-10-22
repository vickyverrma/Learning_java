package LinkedList;

public class start_4_basic {
    public static void display_revll(Node head)
    {
        if(head == null) return;
        display_revll(head.next);
        System.out.println(head.val);
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
        display_revll(a);
    }
}
