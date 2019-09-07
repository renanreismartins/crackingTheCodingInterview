package arraysandstrings

import org.scalatest.{FlatSpec, Matchers}

class ZeroMatrixTest extends FlatSpec with Matchers {

  /*
  023
  456
  789

  000
  056
  089
  */
  it should "set row and column to 0 for '0' elements in the matrix NxN" in {
    ZeroMatrix.zero(Array(Array(0, 2, 3), Array(4, 5, 6), Array(7, 8, 9))) should be (Array(Array(0, 0, 0), Array(0, 5, 6), Array(0, 8, 9)))
  }

  /*
  023
  456

  000
  056
  */
  it should "set row and column to 0 for '0' elements in the matrix NxM" in {
    ZeroMatrix.zero(Array(Array(0, 2, 3), Array(4, 5, 6))) should be (Array(Array(0, 0, 0), Array(0, 5, 6)))
  }

}
