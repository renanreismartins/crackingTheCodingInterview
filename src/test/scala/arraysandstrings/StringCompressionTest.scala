package arraysandstrings

import org.scalatest.{FlatSpec, Matchers}

class StringCompressionTest extends FlatSpec with Matchers {

  it should "compress the string" in {
    StringCompression.compress("aabcccccaaa") should be("a2b1c5a3")
  }

  it should "return original string if the compressed is bigger" in {
    StringCompression.compress("a") should be("a")
    StringCompression.compress("ab") should be("ab")
    StringCompression.compress("aab") should be("aab")
    StringCompression.compress("abbcc") should be("abbcc")
  }

  it should "return original string if the compressed and original string are the same size" in {
    StringCompression.compress("aa") should be("aa")
  }

  // not included in the book
  it should "return empty when the string is empty" in {
    StringCompression.compress_("", 1, "") should be("")
  }

  it should "compress one character" in {
    StringCompression.compress_("a", 1, "") should be("a1")
  }

  it should "compress the same character when it appears twice" in {
    StringCompression.compress_("aa", 1, "") should be("a2")
  }

  it should "compress the same character when it appears more than twice" in {
    StringCompression.compress_("aaa", 1, "") should be("a3")
  }

  it should "compress two different characters" in {
    StringCompression.compress_("ab", 1, "") should be("a1b1")
  }

  it should "compress string beginning with two identical characters and the last different" in {
    StringCompression.compress_("aab", 1, "") should be("a2b1")
  }

  it should "compress string beginning with two different characters and last character identical to the previous" in {
    StringCompression.compress_("abb", 1, "") should be("a1b2")
  }

  it should "compress single character followed by sequences of similar characters" in {
    StringCompression.compress_("abbcc", 1, "") should be("a1b2c2")
  }
}