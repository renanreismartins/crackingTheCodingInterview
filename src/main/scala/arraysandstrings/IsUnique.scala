package arraysandstrings

object IsUnique {

  def isUnique(s: String): Boolean = {
    if (s.isEmpty) return true
    if (isUnique_(s.charAt(0), s.drop(1))) {
      return isUnique(s.drop(1))
    } else {
      false
    }
  }

  private def isUnique_(c: Char, s: String): Boolean = {
    if (s.isEmpty) return true
    if (c.equals(s.charAt(0))) return false
    return isUnique_(c, s.drop(1))
  }
}
