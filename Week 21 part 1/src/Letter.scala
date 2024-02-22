import scala.io.StdIn._

object Letter {
  def main(args: Array[String]): Unit = {
    while (true) {
      println("Enter a character: ")
      val char: Char = readLine().head

      if (!char.isLetter) {
        println("Character is non-alphabetic.")
      } else {
        val lowerChar = char.toLower
        if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
          println("VOWEL")
        } else {
          println("CONSONANT")
        }
      }
    }
  }
}