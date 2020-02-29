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

  // Could add tests to fill the stack then pop until it is empty
  it should "return true true when stack is empty" in {
    val stacks = new ThreeStackOneArray(3)

    stacks.isEmpty(0) should be(true)
  }

  it should "return false when stack is not empty" in {
    val stacks = new ThreeStackOneArray(3)
    stacks.push(0, 1)

    stacks.isEmpty(0) should be(false)
  }

  it should "return true true when stack is full" in {
    val stacks = new ThreeStackOneArray(3)
    stacks.push(0, 1)
    stacks.push(0, 2)
    stacks.push(0, 3)

    stacks.isFull(0) should be(true)
  }

  it should "return false true when stack is not full" in {
    val stacks = new ThreeStackOneArray(3)
    stacks.push(0, 1)
    stacks.push(0, 2)

    stacks.isFull(0) should be(false)
  }

  it should "throws when calling pop from a empty stack" in {
    val stacks = new ThreeStackOneArray(3)

    assertThrows[EmptyStackException] {
      stacks.pop(0)
    }
  }

  //Could add more tests
  it should "pop an item from the stack" in {
    val stacks = new ThreeStackOneArray(3)
    stacks.push(0, 1)

    stacks.pop(0) should be (1)
  }

  it should "peek the current element" in {
    val stacks = new ThreeStackOneArray(3)
    stacks.push(0, 1)
    stacks.push(0, 2)

    stacks.peek(0) should be (2)
  }

  it should "return the index of the top element" in {
    val stacks = new ThreeStackOneArray(3)
    stacks.push(1, 1)
    stacks.push(1, 2)

    stacks.indexOfTop(1) should be (4)
  }


}