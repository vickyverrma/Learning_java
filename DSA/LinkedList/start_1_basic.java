package LinkedList;
class Node{
    int val;
    Node next;
//    Node head = null;
    Node(int val)
    {
        this.val = val;
//        this.next = next;
    }
}
public class start_1_basic {
    public static void main(String[] args) {
        Node a = new Node(10);
//        System.out.println(a.val);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        Node head = a;
        while(head != null)
        {
            System.out.println(head.val);
            head = head.next;
        }

    }
}
