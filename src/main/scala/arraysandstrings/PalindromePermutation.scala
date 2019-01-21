package arraysandstrings

object PalindromePermutation {

  def isPalindromePermutation(s: String): Boolean = {

    val letters: Array[Int] = new Array[Int](128)

    val a = s.toCharArray
    for(c <- a) {
      letters(c) = letters(c) + 1
    }

    letters.filter(e => e % 2 != 0).size <= 1
  }

}
