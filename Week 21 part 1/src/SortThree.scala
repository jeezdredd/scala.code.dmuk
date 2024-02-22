import scala.io.StdIn._

object SortThree {
  def main(args: Array[String]): Unit = {
    print("Enter first integer: ")
    var a: Int = readInt()

    print("Enter second digit: ")
    var b: Int = readInt()

    print("Enter third digit: ")
    var c: Int = readInt()

    if (a > b && b > c) {
      print(c, b, a)
    } else if (a > c && c > b) {
      print(b, c, a)
    } else if (c > b && b > a) {
      print(a, b, c)
    } else if (c > a && a > b) {
      print(b, a, c)
    } else if (b > a && a > c) {
      print(c, a, b)
    } else if (b > c && c > a) {
      print(a, c, b)
    } else {
      print("Something went wrong, Try again")
    }
  }
}
