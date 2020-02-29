package stacksandqueues

import org.scalatest.{FlatSpec, Matchers}

class ThreeStackOneArrayTest extends FlatSpec with Matchers {

  it should "add element to stack one" in {
    val stacks = new ThreeStackOneArray(3)
    stacks.push(0, 1)

    stacks.getValues should be(Array[Int](1, 0, 0, 0, 0, 0, 0, 0, 0))
  }

  it should "add element to stack two" in {
    val stacks = new ThreeStackOneArray(3)
    stacks.push(1, 1)

    stacks.getValues should be(Array[Int](0, 0, 0, 1, 0, 0, 0, 0, 0))
  }

  it should "add element to stack three" in {
    val stacks = new ThreeStackOneArray(3)
    stacks.push(2, 1)

    stacks.getValues should be(Array[Int](0, 0, 0, 0, 0, 0, 1, 0, 0))
  }

}
