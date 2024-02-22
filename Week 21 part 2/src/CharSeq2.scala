import scala.io.StdIn._

object CharSeq2 {
  def main(args: Array[String]): Unit = {
    //    print("Enter first character: ")
    //    val char1: Char = readChar()
    //
    //    print("Enter second character: ")
    //    val char2: Char = readChar()
    //
    //    var start: Char = if (char1 <= char2) char1 else char2
    //    var end: Char = if (char1 <= char2) char2 else char1
    //
    //    while (start <= end) {
    //      print(start + " ")
    //      start = (start + 1).toChar
    //    }
    //  }

    print("Enter first character: ")
    var char1: Char = readChar()

    print("Enter second character: ")
    var char2: Char = readChar()

    if (char1 <= char2) {
      while (char1 <= char2) {
        print(char1 + " ")
        char1 = (char1 + 1).toChar
      }
    } else if (char2 <= char1) {
      while (char2 <= char1) {
        print(char2 + " ")
        char2 = (char2 + 1).toChar
      }
    } else {
      print("Error")
    }
  }
}
