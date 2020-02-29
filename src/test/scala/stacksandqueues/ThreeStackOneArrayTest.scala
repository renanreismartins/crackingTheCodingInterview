package stacksandqueues

import org.scalatest.{FlatSpec, Matchers}

class ThreeStackOneArrayTest extends FlatSpec with Matchers {



  it should "add two elements to stacks" in {
    val stacks = new ThreeStackOneArray(3)
    stacks.push(0, 1)
    stacks.push(0, 2)
    stacks.push(1, 1)
    stacks.push(1, 2)
    stacks.push(2, 1)
    stacks.push(2, 2)

    stacks.getValues should be(Array[Integer](1, 2, null, 1, 2, null, 1, 2, null))
  }

  it should "fill the stacks" in {
    val stacks = new ThreeStackOneArray(3)
    stacks.push(0, 1)
    stacks.push(0, 2)
    stacks.push(0, 3)
    stacks.push(1, 1)
    stacks.push(1, 2)
    stacks.push(1, 3)
    stacks.push(2, 1)
    stacks.push(2, 2)
    stacks.push(2, 3)

    stacks.getValues should be(Array[Int](1, 2, 3, 1, 2, 3, 1, 2, 3))
  }

  it should "add throws when adding more elements than allowed the stacks" in {
    val stacks = new ThreeStackOneArray(3)
    stacks.push(0, 1)
    stacks.push(0, 2)
    stacks.push(0, 3)

    stacks.push(1, 1)
    stacks.push(1, 2)
    stacks.push(1, 3)

    stacks.push(2, 1)
    stacks.push(2, 2)
    stacks.push(2, 3)

    assertThrows[FullStackException] {
      stacks.push(0, 4)
    }

    assertThrows[FullStackException] {
      stacks.push(1, 4)
    }

    assertThrows[FullStackException] {
      stacks.push(2, 4)
    }
  }


  it should "throws when calling pop from a empty stack" in {
    val stacks = new ThreeStackOneArray(3)

    assertThrows[EmptyStackException] {
      stacks.pop(0)
    }
  }


}