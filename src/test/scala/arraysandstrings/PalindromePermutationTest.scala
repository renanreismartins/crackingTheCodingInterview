package arraysandstrings

import org.scalatest.{FlatSpec, Matchers}

class PalindromePermutationTest extends FlatSpec with Matchers {

  "PalindromePermutation" should "return true if input is a palindrome permutation" in {
    PalindromePermutation.isPalindromePermutation("aaa") should be (true)
    PalindromePermutation.isPalindromePermutation("aba") should be (true)
    PalindromePermutation.isPalindromePermutation("tactcoapapa") should be (true)
    PalindromePermutation.isPalindromePermutation("tacocat") should be (true)
  }

  "PalindromePermutation" should "return false if input is not a palindrome permutation" in {
    PalindromePermutation.isPalindromePermutation("aaab") should be (false)
    PalindromePermutation.isPalindromePermutation("baba") should be (false)
    PalindromePermutation.isPalindromePermutation("tactcoaxpapa") should be (false)
  }

}
