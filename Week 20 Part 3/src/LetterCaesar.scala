  import scala.io.StdIn._

  object LetterCaesar {
    def main(args: Array[String]): Unit = {

      print("Enter sentence: ")
      var sentence: String = readLine().toLowerCase()

      print("Enter character to shift: ")
      var character: Char = readChar()

      print("Enter desired shift amount: ")
      var wayShift: Int = readInt() % 26

      var alphabet  = 'a' to 'z'
      var shiftedAlphabet = alphabet.map(char => (char + wayShift).toChar).mkString
      var replacedChar = sentence.replace(character, shiftedAlphabet(alphabet.indexOf(character)))

      println("Encrypted sentence: " + replacedChar)
    }
  }
