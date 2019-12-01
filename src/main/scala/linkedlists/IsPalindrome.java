package linkedlists;

public class IsPalindrome {

    public static boolean isPalindrome(Node n) {
        return Node.reverse(n).equals(n);
    }

}