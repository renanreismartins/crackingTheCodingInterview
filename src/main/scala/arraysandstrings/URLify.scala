package arraysandstrings

object URLify {


  
  // using Array[Char] makes this algorithm way more complicated than necessary. But it is a requirement from the book, otherwise it would be way to easy



  def urlify(str: Array[Char]): String = {

    val totalSpaces = str.foldLeft(0)((total, c) => if (Character.isSpaceChar(c)) total + 1 else total)
    val urlfied = new Array[Char](str.length + (totalSpaces * 2))

    var i = 0
    var urlfiedIndex = 0
    while (i < str.length) {
      if (str(i).equals(' ')) {
        urlfied(urlfiedIndex) = '%'

        urlfiedIndex = urlfiedIndex + 1
        urlfied(urlfiedIndex) = '2'

        urlfiedIndex = urlfiedIndex + 1
        urlfied(urlfiedIndex) = '0'
      } else {
        urlfied(urlfiedIndex) = str(i)
      }

      i = i + 1
      urlfiedIndex = urlfiedIndex + 1
    }

    urlfied.mkString

  }

}
