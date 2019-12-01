package linkedlists

import org.scalatest.{FlatSpec, Matchers}

class IsPalindromeTest extends FlatSpec with Matchers {

  it should "return true when there is only one element" in {
    val n = new Node(1)
    IsPalindrome.isPalindrome(n) should be (true)
  }

  it should "return false if it is not a palindrome" in {
    val n = new Node(1, new Node(2))
    IsPalindrome.isPalindrome(n) should be (false)
  }

  it should "return true if it is a palindrome" in {
    val n = new Node(1, new Node(2, new Node(3, new Node(2, new Node(1)))))
    IsPalindrome.isPalindrome(n) should be (true)
  }

}