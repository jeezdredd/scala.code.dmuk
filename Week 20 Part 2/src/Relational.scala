import scala.io.StdIn._

object Relational {
  def main(args: Array[String]): Unit = {
    print("Enter first digit: ")
    var a: Int = readInt()

    print("Enter second digit: ")
    var b: Int = readInt()

    if(a < b) {
      println(a + " < " + b + " is true")
    } else {
      println(a + " < " + b + " is false")
    }

    if (a > b) {
      println(a + " > " + b + " is true")
    } else {
      println(a + " > " + b + " is false")
    }

    if (a <= b) {
      println(a + " <= " + b + " is true")
    } else {
      println(a + " <= " + b + " is false")
    }

    if (a >= b) {
      println(a + " >= " + b + " is true")
    } else {
      println(a + " >= " + b + " is false")
    }

    if (a == b) {
      println(a + " == " + b + " is true")
    } else {
      println(a + " == " + b + " is false")
    }

    if (a != b) {
      println(a + " != " + b + " is true")
    } else {
      println(a + " != " + b + " is false")
    }
  }
}
