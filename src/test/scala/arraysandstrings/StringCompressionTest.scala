package arraysandstrings

import org.scalatest.{FlatSpec, Matchers}

class StringCompressionTest extends FlatSpec with Matchers {

  it should "compress the string" in {
    StringCompression.compress("aabcccccaaa", 0, "") should be("a2blc5a3")
  }

  // not included in the book
  it should "return empty when the string is empty" in {
    StringCompression.compress("", 0, "") should be("")
  }

  it should "return the original string when the compressed is bigger than the original" in {

  }

}