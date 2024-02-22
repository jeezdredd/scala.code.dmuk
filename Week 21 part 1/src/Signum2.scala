import scala.io.StdIn.*

object Signum2 {
  def main(args: Array[String]): Unit = {
    println("Type a number: ")
    var number = readInt()

    var message =
      if (number > 0) number + " is positive"
      else if (number < 0) number + " is negative"
      else number + " is zero"

    println(message)
  }
}
