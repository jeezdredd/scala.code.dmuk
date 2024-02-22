import scala.io.StdIn._

object Caesar {
  def main(args: Array[String]): Unit = {

    print("Enter a lowercase character: ")
    var charToEncrypt = readChar()

    print("Enter a shift amount: ")
    var charShift = readInt()

    var lowercaseChar = charToEncrypt.toLower
    var lowercaseShift = charShift % 26

    var shiftedChar = (lowercaseChar - 'a' + lowercaseShift) % 26 + 'a'

    println("Original character:" + charToEncrypt)
    println("Shifted character: " + shiftedChar.toChar)

  }
}