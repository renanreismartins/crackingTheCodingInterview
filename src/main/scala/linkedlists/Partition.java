package linkedlists;


public class Partition {

    public static Node partition(Node n, int x) {
        return partition_(n.next, x, new Node(n.data));
    }

    public static Node partition_(Node n, int x, Node acc) {

        if (n == null) { return acc; }

        if (n.data < x) {
            acc = new Node(n.data, acc);
        } else {
            acc.appendToTail(n.data);
        }
        return partition_(n.next, x, acc);
    }
}