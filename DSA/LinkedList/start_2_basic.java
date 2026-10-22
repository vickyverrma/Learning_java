package LinkedList;

public class start_2_basic {
    public static void print(Node head) {
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.val);
            temp = temp.next;
        }

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
        print(d);
        System.out.println(d.val);


    }
}
