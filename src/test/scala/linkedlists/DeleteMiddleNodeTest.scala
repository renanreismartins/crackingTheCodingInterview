package linkedlists

import org.scalatest.{FlatSpec, Matchers}

class DeleteMiddleNodeTest extends FlatSpec with Matchers {

  it should "delete the the given node" in {
    val node4 = new Node(4)
    val node3 = new Node(3, node4)
    val node2 = new Node(2, node3)
    val n = new Node(1, node2)
    DeleteMiddleNode.deleteInTheMiddle(node2)
    n should be(new Node(1, new Node(3, new Node(4))))
  }

}
