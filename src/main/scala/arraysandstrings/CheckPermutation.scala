package arraysandstrings

import scala.collection.immutable.HashMap

object CheckPermutation {

  def isPermutation(s1: String, s2: String): Boolean = {
    if (s1.length != s2.length) return false;

    val map1: HashMap[Char, Int] = calcTable(s1)
    val map2: HashMap[Char, Int] = calcTable(s2)

    merge(map1, map2).foldLeft(0) {
      case (total, (_, v)) => total + v
    } == 0
  }

  def calcTable(s1: String): HashMap[Char, Int] = s1.foldLeft(HashMap.empty[Char, Int])((m, e) => m.updated(e, m.get(e).getOrElse(0) + 1))

  def merge(map1: HashMap[Char, Int], map2: HashMap[Char, Int]): HashMap[Char, Int] = {
    map1.merged(map2) {
      case ((k1, v1), (_, v2)) => ((k1, Math.abs(v1 - v2)))
    }
  }

}
