package linkedlists;

public class DeleteMiddleNode {

    public static void deleteInTheMiddle(Node n) {
        //n = n.next;
        n.data = n.next.data;
        n.next = n.next.next;
    }
}
