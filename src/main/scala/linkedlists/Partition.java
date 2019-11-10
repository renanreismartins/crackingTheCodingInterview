package linkedlists;


public class Partition {
    public static Node partition(Node n, int x) {

        Node left = null;
        Node right = null;

        while (n != null) {
            if (n.data < x) {
                if (left == null) {
                    left = new Node(n.data);
                } else {
                    left.appendToTail(n.data);
                }
            } else {
                if (right == null) {
                    right = new Node(n.data);
                } else {
                    right.appendToTail(n.data);
                }
            }

            n = n.next;
        }

        while (right != null) {
            left.appendToTail(right.data);
            right = right.next;
        }

        return left;
    }
}