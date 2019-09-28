package arraysandstrings

object Rotation {

  def isRotation(a: String, b: String): Boolean = {
    a.concat(a).contains(b)
  }

}
