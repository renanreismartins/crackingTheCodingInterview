package arraysandstrings

object RotateMatrix {

  def rotate(a: Array[Array[Int]]): Array[Array[Int]] = {
    val matrixSize = a.size - 1

    val r : Array[Array[Int]] =  Array.ofDim[Int](a.size, a.size)
    for (l <- 0 to matrixSize) {
      for (c <- 0 to matrixSize) {
        r(c)(matrixSize - l) = a(l)(c)
      }
    }

    r
  }
}