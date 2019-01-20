package arraysandstrings

import scala.collection.immutable.HashMap

object IsUnique {

  def isUnique(s: String): Boolean = {
    if (s.isEmpty) return true
    if (isUnique_(s.charAt(0), s.drop(1))) {
      isUnique(s.drop(1))
    } else {
      false
    }
  }

  private def isUnique_(c: Char, s: String): Boolean = {
    if (s.isEmpty) return true
    if (c.equals(s.charAt(0))) return false
    isUnique_(c, s.drop(1))
  }

  // Implemented after checking the book solution
  def isUniqueOptimized(s: String): Boolean = {
    isUniqueOptimized_(s, HashMap.empty)
  }

  private def isUniqueOptimized_(s: String, table: HashMap[Char, Boolean]): Boolean = {
    if (s.isEmpty) return true
    if (table.get(s.charAt(0)).getOrElse(false)) return false
    isUniqueOptimized_(s.drop(1), table + (s.charAt(0) -> true))
  }

}
