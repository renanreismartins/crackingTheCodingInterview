package arraysandstrings

import org.scalatest.{FlatSpec, Matchers}

class CheckPermutationTest extends FlatSpec with Matchers {

  "CheckPermutation" should "return false if the strings do not have the same size" in {
    CheckPermutation.isPermutation("a", "aa") should be(false)
  }

  it should "return true if the second string is permutation of the first" in {
    CheckPermutation.isPermutation("a", "a") should be(true)
    CheckPermutation.isPermutation("aa", "aa") should be(true)

    CheckPermutation.isPermutation("ab", "ab") should be(true)
    CheckPermutation.isPermutation("ab", "ba") should be(true)

    CheckPermutation.isPermutation("abc", "cba") should be(true)
    CheckPermutation.isPermutation("abc", "cab") should be(true)
    CheckPermutation.isPermutation("abc", "bca") should be(true)
    CheckPermutation.isPermutation("abc", "bac") should be(true)

    CheckPermutation.isPermutation("abcc", "bacc") should be(true)
    CheckPermutation.isPermutation("abcc", "cbac") should be(true)
  }

  it should "return false if the second string is not permutation of the first" in {
    CheckPermutation.isPermutation("a", "b") should be(false)
    CheckPermutation.isPermutation("ab", "aa") should be(false)
    CheckPermutation.isPermutation("aa", "ab") should be(false)
    CheckPermutation.isPermutation("aa", "ad") should be(false)

    CheckPermutation.isPermutation("abcc", "abcd") should be(false)
  }

}
