import scala.io.StdIn.readInt

object OddEven {
  def main(args: Array[String]): Unit = {
    println("Type in a number ")
    var number: Int = readInt()

    var result = if (number % 2 == 0) {
      "even"
    } else {
      "odd"
    }

    var check = if (number > 0) {
      " and greater than zero"
    } else {
      " and lower than zero"
    }

      println("Your number is " + result + check)
  }
}