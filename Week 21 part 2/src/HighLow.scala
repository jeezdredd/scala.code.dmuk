import scala.io.StdIn._
import scala.util.Random

object HighLow {
  def main(args: Array[String]): Unit = {
    var secret: Int = 12
    var tries: Int = 0

    println("Guess")
    print("? ")
    var userEnter: Int = readInt()

    while {
      if (userEnter < secret) {
        println("Higher")
        print("? ")

        userEnter = readInt()
      } else if (userEnter > secret) {
        println("Lower")
        print("? ")

        userEnter = readInt()
      } else {
        print("error")
      }

      tries = tries + 1
      (userEnter != secret)
    } do ()

    print(s"you guessed right, the number is: $secret, the number of tries is $tries")
  }
}
