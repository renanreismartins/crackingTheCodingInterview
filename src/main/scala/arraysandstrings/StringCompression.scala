package arraysandstrings

object StringCompression {

  def compress(s: String): String = {
    val compressed = compress_(s, 1, "")

    if (compressed.size < s.size) compressed else s
  }

  def compress_(s: String, count: Int, acc: String): String = {
    if (s.isEmpty) {
      ""
    } else if (s.size == 1) {
      acc + s + count
    } else if (s.charAt(0) == s.charAt(1)) {
      compress_(s.drop(1), count + 1, acc)
    } else {
      compress_(s.drop(1), 1, acc + s.take(1) + count)
    }
  }

}