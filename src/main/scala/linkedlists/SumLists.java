package linkedlists;

public class SumLists {
    public static int sum(Node n1, Node n2) {
        return Integer.valueOf(convertToString(Node.reverse(n1))) + Integer.valueOf(convertToString(Node.reverse((n2))));
    }

    public static String convertToString(Node n) {
        StringBuffer r = new StringBuffer();
        while (n != null) {
            r.append(n.data);
            n = n.next;
        }

        return r.toString();
    }

}
