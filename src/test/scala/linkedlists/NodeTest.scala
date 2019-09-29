package linkedlists

import org.scalatest.{FlatSpec, Matchers}

class NodeTest extends FlatSpec with Matchers {

  it should "return the same list when there is only one element" in {
    val n = new Node(1)
    Node.removeDuplicates(n) should be(new Node(1))
  }

  it should "remove the when there is one duplicate" in {
    val n = new Node(1, new Node(1))
    Node.removeDuplicates(n) should be(new Node(1))
  }

  it should "remove the when there is more than duplicate" in {
    val n = new Node(1, new Node(1, new Node(1)))
    Node.removeDuplicates(n) should be(new Node(1))
  }

  it should "return the same list when there is no duplicates" in {
    val n = new Node(1, new Node(2, new Node(3)))
    Node.removeDuplicates(n) should be(new Node(1, new Node(2, new Node(3))))
  }

  it should "return the size" in {
    Node.size(new Node(1)) should be (1)
    Node.size(new Node(1, new Node(2))) should be (2)
  }
}
