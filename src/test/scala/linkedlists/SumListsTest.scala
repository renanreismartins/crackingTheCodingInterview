package linkedlists

import org.scalatest.{FlatSpec, Matchers}

class SumListsTest  extends FlatSpec with Matchers {
  it should "sum inverted lists" in {
    val n1 = new Node(7, new Node(1, new Node(6)))
    val n2 = new Node(5, new Node(9, new Node(2)))

    SumLists.sum(n1, n2) should be(912)
  }
}
