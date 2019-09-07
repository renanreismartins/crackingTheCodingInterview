package arraysandstrings

import org.scalatest.{FlatSpec, Matchers}

class RotateMatrixTest extends FlatSpec with Matchers {

  /*
  12
  34

  31
  42
  */
  it should "rotate a 2x2 matrix" in {
    RotateMatrix.rotate(Array(Array(1, 2), Array(3, 4))) should be (Array(Array(3, 1), Array(4, 2)))
  }

  /*
  123
  456
  789

  741
  852
  963
  */
  it should "rotate a 3x3 matrix" in {
    RotateMatrix.rotate(Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9))) should be (Array(Array(7, 4, 1), Array(8, 5, 2), Array(9, 6, 3)))
  }

}