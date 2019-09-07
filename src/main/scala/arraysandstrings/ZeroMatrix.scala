package arraysandstrings

object ZeroMatrix {

  def zero(a: Array[Array[Int]]): Array[Array[Int]] = {
    var foundZero = false
    val width = a(0).size - 1
    val height = a.size - 1

    var foundZeroL = 0
    var foundZeroC = 0

    var c = 0
    var l = 0
    while (l <= height && foundZero == false) {
      while (c <= width && foundZero == false) {
        if (a(l)(c) == 0) {
          foundZero = true
          foundZeroL = l
          foundZeroC = c
        }
        c = c + 1
      }
      l = l + 1
    }

    if (foundZero) {

      for (c1 <- 0 to width) {
        a(foundZeroL)(c1) = 0
      }

      for (l1 <- 0 to height) {
        a(l1)(foundZeroC) = 0
      }
    }

    a
  }
}
