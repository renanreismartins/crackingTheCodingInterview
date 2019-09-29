package linkedlists

import org.scalatest.{FlatSpec, Matchers}

class KthToLastTest extends FlatSpec with Matchers {

  it should "calculate the kth to last" in {
    val n = new Node(1, new Node(2, new Node(3, new Node(4))))
    KthToLast.KthToLast(n, 1) should be(new Node(3, new Node(4)))
    KthToLast.KthToLast(n, 3) should be(new Node(1, new Node(2, new Node(3, new Node(4)))))
  }

}