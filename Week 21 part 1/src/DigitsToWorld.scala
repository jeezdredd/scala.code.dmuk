import scala.io.StdIn._

object DigitsToWorld {
  def main(args: Array[String]): Unit = {

    print("Enter digit (0-9) ")
    var digit: Int = readInt()

    if (digit == 0) {
      println("ZERO")
    } else if (digit == 1) {
      println("ONE")
    } else if (digit == 2) {
      println("TWO")
    } else if (digit == 3) {
      println("THREE")
    } else if (digit == 4) {
      println("FOUR")
    } else if (digit == 5) {
      println("FIVE")
    } else if (digit == 6) {
      println("SIX")
    } else if (digit == 7) {
      println("SEVEN")
    } else if (digit == 8) {
      println("EIGHT")
    } else if (digit == 9) {
      println("NINE")
    } else {
      println("INVALID NUMBER")
    }
   }
}
