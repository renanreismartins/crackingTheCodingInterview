package linkedlists;

public class KthToLast {

    // not covering when kthToLast is bigger than the list
    public static Node KthToLast(Node head, int kthToLast) {
        Node n = head;

        if (kthToLast == Node.size(n) - 1) {
            return n;
        } else {
            return KthToLast(n.next, kthToLast);
        }
    }

}