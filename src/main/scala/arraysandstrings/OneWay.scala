package arraysandstrings

object OneWay {

  def isEdit(s: String, s2: String): Boolean = {
    val letters: Array[Int] = new Array[Int](128)

    for (c <- s.toCharArray) {
      letters(c) = letters(c) + 1
    }

    for (c <- s2.toCharArray) {
      letters(c) = letters(c) - 1
    }

    // could be extracted to a method to inform the number of changes
    var numberOfChanges = letters.filter(e => e != 0).size
    if (s.size == s2.size) {
      numberOfChanges = numberOfChanges / 2
    } else {
      numberOfChanges == numberOfChanges - Math.abs((s.size - s2.size))
    }

    numberOfChanges == 1
  }

}