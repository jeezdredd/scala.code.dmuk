import scala.io.StdIn._

object CharSeq3 {
  def main(args: Array[String]): Unit = {
    print("Enter first character: ")
    var char1: Char = readChar()

    print("Enter second character: ")
    var char2: Char = readChar()

    if (char1 <= char2) {
      while (char1 <= char2) {
        print(char1 + " ")
        char1 = (char1 + 1).toChar
      }
    } else {
      while (char2 <= char1) {
        print(char1 + " ")
        char1 = (char1 - 1).toChar
      }
    }
  }
}
