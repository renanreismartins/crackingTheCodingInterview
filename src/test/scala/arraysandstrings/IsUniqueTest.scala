package arraysandstrings

import org.scalatest.{FlatSpec, Matchers}

class IsUniqueTest extends FlatSpec with Matchers {

  "isUnique" should "return true if a String contains only unique characters"  in {
    IsUnique.isUnique("") should be(true)
    IsUnique.isUnique("a") should be(true)
    IsUnique.isUnique("ab") should be(true)
    IsUnique.isUnique("abc") should be(true)
  }

  it should "return false if a String contains repeated characters"  in {
    IsUnique.isUnique("aa") should be(false)
    IsUnique.isUnique("aba") should be(false)
    IsUnique.isUnique("aac") should be(false)
    IsUnique.isUnique("abcad") should be(false)
    IsUnique.isUnique("abca") should be(false)
  }

  "isUniqueOptimized" should "return true if a String contains only unique characters"  in {
    IsUnique.isUniqueOptimized("") should be(true)
    IsUnique.isUniqueOptimized("a") should be(true)
    IsUnique.isUniqueOptimized("ab") should be(true)
    IsUnique.isUniqueOptimized("abc") should be(true)
  }

  it should "return false if a String contains repeated characters"  in {
    IsUnique.isUniqueOptimized("aa") should be(false)
    IsUnique.isUniqueOptimized("aba") should be(false)
    IsUnique.isUniqueOptimized("aac") should be(false)
    IsUnique.isUniqueOptimized("abcad") should be(false)
    IsUnique.isUniqueOptimized("abca") should be(false)
  }

}
