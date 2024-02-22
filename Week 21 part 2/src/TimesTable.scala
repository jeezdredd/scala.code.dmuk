import scala.io.StdIn._

object TimesTable {
  def main(args: Array[String]): Unit = {
    print("Enter integer value: ")
    var x: Int = readInt()
    var y = 1

    while (y < 13) {
      var z = y * x
      println(y + " x " + x + " = " + z)
      y += 1
    }
  }
}
