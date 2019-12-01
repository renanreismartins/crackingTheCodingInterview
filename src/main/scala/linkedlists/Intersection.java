package linkedlists;

public class Intersection {

    public static Node intersection(Node n1, Node n2) {

        int n1Size = Node.size(n1);
        int n2Size = Node.size(n2);
        int sizeDifference = Math.abs(n1Size - n2Size);

        if (n1Size > n2Size) {
            Node n1Cut = KthToLast.KthToLast(n1, sizeDifference);
            return findIntersection(n1Cut, n2);
        } else {
            Node n2Cut = KthToLast.KthToLast(n2, sizeDifference);
            return findIntersection(n1, n2Cut);
        }
    }

    private static Node findIntersection(Node n1, Node n2) {
        if (n1 == null) {
            return null;
        }

        if (n1 == n2) {
            return n1;
        } else {
            return findIntersection(n1.next, n2.next);
        }
    }

}