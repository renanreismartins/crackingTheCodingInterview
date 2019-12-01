package linkedlists;


import java.util.HashMap;
import java.util.Objects;

class Node {
    public Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    public Node(int d, Node next) {
        data = d;
        this.next = next;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public static Node reverse(Node n) {
        return reverse_(n, null);
    }

    private static Node reverse_(Node n, Node acc) {
        if (n == null) {
            return acc;
        }

        Node head = new Node(n.data, acc);
        return reverse_(n.next, head);
    }

    public static Node deleteNode(Node head, int d) {
        Node n = head;
        if (n.data == d) {
            return head.next;
        }

        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head; /* head didn't change*/
            }
            n = n.next;
        }
        return head;
    }

    public static Node removeDuplicates(Node head) {
        HashMap<Integer, Boolean> m = new HashMap<>();
        m.put(head.data, true);

        Node n = head;

        while (n != null && n.next != null) {
            if (m.getOrDefault(n.next.data, false)) {
                n.next = n.next.next;
            } else {
                m.put(n.next.data, true);
                n = n.next;
            }
        }

        return head;
    }

    public static int size(Node head) {
        int size = 1;
        while (head.next != null) {
            size++;
            head = head.next;
        }

        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return data == node.data &&
                Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(next, data);
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
}