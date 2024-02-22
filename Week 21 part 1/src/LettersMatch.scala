import scala.io.StdIn._

object LettersMatch {
  def main(args: Array[String]): Unit = {
      print("Enter a character: ")
      var readChar: Char = readLine().head

      if (!readChar.isLetter) {
        print("Character is non-alphabetic")
      } else {

        if (readChar.isLetter) {
          var lowerChar = readChar.toLower

          var charInputCheck: Unit = lowerChar match {
            case 'a' => println("VOWEL")
            case 'e' => println("VOWEL")
            case 'i' => println("VOWEL")
            case 'o' => println("VOWEL")
            case 'u' => println("VOWEL")
          }
        } else {
          println("CONSONANT")
        }
      }
    }
  }

