package linkedlists

import org.scalatest.{FlatSpec, Matchers}

class IntersectionTest extends FlatSpec with Matchers {

  it should "return return the intersection node" in {
    val n10 = new Node(10)
    val n9 = new Node(9, n10)

    val n3 = new Node(3, n9)
    val n2 = new Node(2, n3)
    val n1 = new Node(1, n2)

    val n5 = new Node(1, n9)

    Intersection.intersection(n1, n5) should be (n9)
  }

}