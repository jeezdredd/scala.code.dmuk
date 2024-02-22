import scala.io.StdIn._

object Colours {
  def main(args: Array[String]): Unit = {
   print("Enter one digit (1-7): ")
    var digit: Char = readChar()

      var result = digit match {
        case '1' => println("RED")
        case '2' => println("ORANGE")
        case '3' => println("YELLOW")
        case '4' => println("GREEN")
        case '5' => println("BLUE")
        case '6' => println("NAVY BLUE")
        case '7' => println("PURPLE")
      }

    println(result)
  }
}
