import scala.io.StdIn._

object TimesTable {
  def main(args: Array[String]): Unit = {
    print("Enter integer value: ")
    var integer: Int = readInt()

    var start = 1
    var end = 12
    var result = 0

    for (x <- start to end) {
      result = integer * x
      println(f"$x%2d x $integer = $result%2d")
    }
  }
}
