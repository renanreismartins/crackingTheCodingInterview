package arraysandstrings

import org.scalatest.{FlatSpec, FunSuite, Matchers}

class OneWayTest extends FlatSpec with Matchers {

  it should "return true for one character removal" in {
    OneWay.isEdit("pale", "ple") should be (true)
  }

  it should "return true for one character addition" in {
    OneWay.isEdit("pale", "pales") should be (true)
  }

  it should "return true for one character replacement" in {
    OneWay.isEdit("pale", "bale") should be (true)
  }

  it should "return true for two characters replacement" in {
    OneWay.isEdit("pale", "bake") should be (false)
  }

  //not in the book test cases
  it should "return false for one character replacement and one character removal" in {
    OneWay.isEdit("pale", "pay") should be (false)
  }

  it should "return false for two character replacements" in {
    OneWay.isEdit("pale", "bole") should be (false)
  }

  it should "return false for the same string" in {
    OneWay.isEdit("a", "a") should be (false)
  }
}
