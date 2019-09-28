package arraysandstrings

import org.scalatest.{FlatSpec, Matchers}

class RotationTest extends FlatSpec with Matchers {

  it should "should identify rotation" in {
    Rotation.isRotation("erbottlewat", "waterbottle") should be(true)
    Rotation.isRotation("rbottlewate", "waterbottle") should be(true)
    Rotation.isRotation("tlewaterbot", "waterbottle") should be(true)
  }

  it should "should identify a non rotation" in {
    Rotation.isRotation("erbottlewa", "waterbottle") should be(false)
  }
}