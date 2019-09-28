package arraysandstrings

object Rotation {

  def isRotation(a: String, b: String): Boolean = {
    val index = b.indexOf(a.charAt(0))
    val splittedB = b.splitAt(index)

    val r = splittedB._2.concat(splittedB._1)

    a.equals(r)

  }

}
