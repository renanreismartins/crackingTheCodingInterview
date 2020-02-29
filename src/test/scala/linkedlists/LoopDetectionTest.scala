package linkedlists

import org.scalatest.{FlatSpec, Matchers}

class LoopDetectionTest extends FlatSpec with Matchers {

  it should "should find the element that causes the loop" in {
    val e = new Node(5)
    val d = new Node(4, e)
    val c = new Node(3, d)
    val b = new Node(2, c)
    val a = new Node(1, b)
    e.next = c

    LoopDetection.detectLoop(a) should be(c)
  }

}